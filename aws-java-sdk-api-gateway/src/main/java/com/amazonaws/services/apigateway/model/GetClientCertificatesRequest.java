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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class GetClientCertificatesRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    private String position;

    private Integer limit;

    /**
     * @param position
     */

    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return
     */

    public String getPosition() {
        return this.position;
    }

    /**
     * @param position
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetClientCertificatesRequest withPosition(String position) {
        setPosition(position);
        return this;
    }

    /**
     * @param limit
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * @return
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @param limit
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetClientCertificatesRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPosition() != null)
            sb.append("Position: " + getPosition() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetClientCertificatesRequest == false)
            return false;
        GetClientCertificatesRequest other = (GetClientCertificatesRequest) obj;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null
                && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null
                && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode
                + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public GetClientCertificatesRequest clone() {
        return (GetClientCertificatesRequest) super.clone();
    }
}