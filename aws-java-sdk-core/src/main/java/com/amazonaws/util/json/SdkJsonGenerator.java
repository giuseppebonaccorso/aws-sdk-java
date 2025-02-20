/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.util.json;

import com.amazonaws.AmazonClientException;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Date;

/**
 * Thin wrapper around Jackson's JSON generator.
 */
public class SdkJsonGenerator {

    /**
     * Default buffer size for the BAOS. Chosen somewhat arbitrarily. Should be large enough to
     * prevent frequent resizings but small enough to avoid wasted allocations for small requests.
     */
    private static final int DEFAULT_BUFFER_SIZE = 1024;

    /**
     * Indicates an issue writing JSON content.
     */
    public static class JsonGenerationException extends AmazonClientException {

        public JsonGenerationException(Throwable t) {
            super(t);
        }
    }

    /**
     * Recommended to share JsonFactory instances per http://wiki.fasterxml.com/JacksonBestPracticesPerformance
     */
    private static final JsonFactory FACTORY = new JsonFactory();

    private final ByteArrayOutputStream baos = new ByteArrayOutputStream(DEFAULT_BUFFER_SIZE);
    private final JsonGenerator generator;

    public SdkJsonGenerator() {
        try {
            // Create generator with UTF-8 encoding
            this.generator = FACTORY.createGenerator(baos);
        } catch (IOException e) {
            throw new JsonGenerationException(e);
        }
    }

    public SdkJsonGenerator writeStartArray() {
        try {
            generator.writeStartArray();
        } catch (IOException e) {
            throw new JsonGenerationException(e);
        }
        return this;
    }

    public SdkJsonGenerator writeEndArray() {
        try {
            generator.writeEndArray();
        } catch (IOException e) {
            throw new JsonGenerationException(e);
        }
        return this;
    }

    public SdkJsonGenerator writeStartObject() {
        try {
            generator.writeStartObject();
        } catch (IOException e) {
            throw new JsonGenerationException(e);
        }
        return this;
    }

    public SdkJsonGenerator writeEndObject() {
        try {
            generator.writeEndObject();
        } catch (IOException e) {
            throw new JsonGenerationException(e);
        }
        return this;
    }

    public SdkJsonGenerator writeFieldName(String fieldName) {
        try {
            generator.writeFieldName(fieldName);
        } catch (IOException e) {
            throw new JsonGenerationException(e);
        }
        return this;
    }

    public SdkJsonGenerator writeValue(String val) {
        try {
            generator.writeString(val);
        } catch (IOException e) {
            throw new JsonGenerationException(e);
        }
        return this;
    }

    public SdkJsonGenerator writeValue(boolean bool) {
        try {
            generator.writeBoolean(bool);
        } catch (IOException e) {
            throw new JsonGenerationException(e);
        }
        return this;
    }

    public SdkJsonGenerator writeValue(long val) {
        try {
            generator.writeNumber(val);
        } catch (IOException e) {
            throw new JsonGenerationException(e);
        }
        return this;
    }

    public SdkJsonGenerator writeValue(double val) {
        try {
            generator.writeNumber(val);
        } catch (IOException e) {
            throw new JsonGenerationException(e);
        }
        return this;
    }

    public SdkJsonGenerator writeValue(ByteBuffer bytes) {
        try {
            generator.writeBinary(BinaryUtils.toArray(bytes));
        } catch (IOException e) {
            throw new JsonGenerationException(e);
        }
        return this;
    }

    public SdkJsonGenerator writeValue(Date date) {
        try {
            generator.writeNumber(DateUtils.formatServiceSpecificDate(date));
        } catch (IOException e) {
            throw new JsonGenerationException(e);
        }
        return this;
    }

    /**
     * Closes the generator and flushes to write. Must be called when finished writing JSON
     * content.
     */
    private void close() {
        try {
            generator.close();
        } catch (IOException e) {
            throw new JsonGenerationException(e);
        }
    }

    /**
     * Get the JSON content as a UTF-8 encoded byte array. It is recommended to hold onto the array
     * reference rather then making repeated calls to this method as a new array will be created
     * each time.
     *
     * @return Array of UTF-8 encoded bytes that make up the generated JSON.
     */
    public byte[] getBytes() {
        close();
        return baos.toByteArray();
    }

}
