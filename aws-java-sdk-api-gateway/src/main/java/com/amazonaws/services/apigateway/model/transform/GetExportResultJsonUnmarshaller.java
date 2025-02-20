/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.apigateway.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetExportResult JSON Unmarshaller
 */
public class GetExportResultJsonUnmarshaller implements
        Unmarshaller<GetExportResult, JsonUnmarshallerContext> {

    public GetExportResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        GetExportResult getExportResult = new GetExportResult();

        if (context.isStartOfDocument()) {
            if (context.getHeader("Content-Type") != null) {
                context.setCurrentHeader("Content-Type");
                getExportResult.setContentType(StringJsonUnmarshaller
                        .getInstance().unmarshall(context));
            }
            if (context.getHeader("Content-Disposition") != null) {
                context.setCurrentHeader("Content-Disposition");
                getExportResult.setContentDisposition(StringJsonUnmarshaller
                        .getInstance().unmarshall(context));
            }
        }

        java.io.InputStream is = context.getHttpResponse().getContent();
        if (is != null) {
            try {
                getExportResult.setBody(java.nio.ByteBuffer
                        .wrap(com.amazonaws.util.IOUtils.toByteArray(is)));
            } finally {
                com.amazonaws.util.IOUtils.closeQuietly(is, null);
            }
        }

        return getExportResult;
    }

    private static GetExportResultJsonUnmarshaller instance;

    public static GetExportResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetExportResultJsonUnmarshaller();
        return instance;
    }
}
