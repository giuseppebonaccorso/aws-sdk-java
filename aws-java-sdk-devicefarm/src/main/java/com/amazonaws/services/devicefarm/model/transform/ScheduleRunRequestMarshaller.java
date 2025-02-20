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

package com.amazonaws.services.devicefarm.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.devicefarm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ScheduleRunRequest Marshaller
 */
public class ScheduleRunRequestMarshaller implements
        Marshaller<Request<ScheduleRunRequest>, ScheduleRunRequest> {

    public Request<ScheduleRunRequest> marshall(
            ScheduleRunRequest scheduleRunRequest) {

        if (scheduleRunRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ScheduleRunRequest> request = new DefaultRequest<ScheduleRunRequest>(
                scheduleRunRequest, "AWSDeviceFarm");
        request.addHeader("X-Amz-Target", "DeviceFarm_20150623.ScheduleRun");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final SdkJsonGenerator jsonGenerator = new SdkJsonGenerator();

            jsonGenerator.writeStartObject();

            if (scheduleRunRequest.getProjectArn() != null) {
                jsonGenerator.writeFieldName("projectArn").writeValue(
                        scheduleRunRequest.getProjectArn());
            }
            if (scheduleRunRequest.getAppArn() != null) {
                jsonGenerator.writeFieldName("appArn").writeValue(
                        scheduleRunRequest.getAppArn());
            }
            if (scheduleRunRequest.getDevicePoolArn() != null) {
                jsonGenerator.writeFieldName("devicePoolArn").writeValue(
                        scheduleRunRequest.getDevicePoolArn());
            }
            if (scheduleRunRequest.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(
                        scheduleRunRequest.getName());
            }
            if (scheduleRunRequest.getTest() != null) {
                jsonGenerator.writeFieldName("test");
                ScheduleRunTestJsonMarshaller.getInstance().marshall(
                        scheduleRunRequest.getTest(), jsonGenerator);
            }
            if (scheduleRunRequest.getConfiguration() != null) {
                jsonGenerator.writeFieldName("configuration");
                ScheduleRunConfigurationJsonMarshaller.getInstance().marshall(
                        scheduleRunRequest.getConfiguration(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length",
                    Integer.toString(content.length));
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
