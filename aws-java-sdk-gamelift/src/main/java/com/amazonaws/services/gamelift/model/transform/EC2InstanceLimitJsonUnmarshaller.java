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

package com.amazonaws.services.gamelift.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.gamelift.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EC2InstanceLimit JSON Unmarshaller
 */
public class EC2InstanceLimitJsonUnmarshaller implements
        Unmarshaller<EC2InstanceLimit, JsonUnmarshallerContext> {

    public EC2InstanceLimit unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        EC2InstanceLimit eC2InstanceLimit = new EC2InstanceLimit();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("EC2InstanceType", targetDepth)) {
                    context.nextToken();
                    eC2InstanceLimit.setEC2InstanceType(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("CurrentInstances", targetDepth)) {
                    context.nextToken();
                    eC2InstanceLimit
                            .setCurrentInstances(IntegerJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("InstanceLimit", targetDepth)) {
                    context.nextToken();
                    eC2InstanceLimit.setInstanceLimit(IntegerJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                                currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return eC2InstanceLimit;
    }

    private static EC2InstanceLimitJsonUnmarshaller instance;

    public static EC2InstanceLimitJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EC2InstanceLimitJsonUnmarshaller();
        return instance;
    }
}
