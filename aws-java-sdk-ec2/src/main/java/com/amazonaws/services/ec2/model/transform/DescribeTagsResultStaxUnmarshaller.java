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

package com.amazonaws.services.ec2.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DescribeTagsResult StAX Unmarshaller
 */
public class DescribeTagsResultStaxUnmarshaller implements
        Unmarshaller<DescribeTagsResult, StaxUnmarshallerContext> {

    public DescribeTagsResult unmarshall(StaxUnmarshallerContext context)
            throws Exception {
        DescribeTagsResult describeTagsResult = new DescribeTagsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeTagsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("tagSet/item", targetDepth)) {
                    describeTagsResult.getTags().add(
                            TagDescriptionStaxUnmarshaller.getInstance()
                                    .unmarshall(context));
                    continue;
                }

                if (context.testExpression("nextToken", targetDepth)) {
                    describeTagsResult.setNextToken(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeTagsResult;
                }
            }
        }
    }

    private static DescribeTagsResultStaxUnmarshaller instance;

    public static DescribeTagsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeTagsResultStaxUnmarshaller();
        return instance;
    }
}
