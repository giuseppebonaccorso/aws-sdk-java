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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeVolumeStatusResult implements Serializable, Cloneable {

    /**
     * <p>
     * A list of volumes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VolumeStatusItem> volumeStatuses;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of volumes.
     * </p>
     * 
     * @return A list of volumes.
     */

    public java.util.List<VolumeStatusItem> getVolumeStatuses() {
        if (volumeStatuses == null) {
            volumeStatuses = new com.amazonaws.internal.SdkInternalList<VolumeStatusItem>();
        }
        return volumeStatuses;
    }

    /**
     * <p>
     * A list of volumes.
     * </p>
     * 
     * @param volumeStatuses
     *        A list of volumes.
     */

    public void setVolumeStatuses(
            java.util.Collection<VolumeStatusItem> volumeStatuses) {
        if (volumeStatuses == null) {
            this.volumeStatuses = null;
            return;
        }

        this.volumeStatuses = new com.amazonaws.internal.SdkInternalList<VolumeStatusItem>(
                volumeStatuses);
    }

    /**
     * <p>
     * A list of volumes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setVolumeStatuses(java.util.Collection)} or
     * {@link #withVolumeStatuses(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param volumeStatuses
     *        A list of volumes.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeVolumeStatusResult withVolumeStatuses(
            VolumeStatusItem... volumeStatuses) {
        if (this.volumeStatuses == null) {
            setVolumeStatuses(new com.amazonaws.internal.SdkInternalList<VolumeStatusItem>(
                    volumeStatuses.length));
        }
        for (VolumeStatusItem ele : volumeStatuses) {
            this.volumeStatuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of volumes.
     * </p>
     * 
     * @param volumeStatuses
     *        A list of volumes.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeVolumeStatusResult withVolumeStatuses(
            java.util.Collection<VolumeStatusItem> volumeStatuses) {
        setVolumeStatuses(volumeStatuses);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value
     *        is <code>null</code> when there are no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value
     *         is <code>null</code> when there are no more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value
     *        is <code>null</code> when there are no more results to return.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeVolumeStatusResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getVolumeStatuses() != null)
            sb.append("VolumeStatuses: " + getVolumeStatuses() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVolumeStatusResult == false)
            return false;
        DescribeVolumeStatusResult other = (DescribeVolumeStatusResult) obj;
        if (other.getVolumeStatuses() == null
                ^ this.getVolumeStatuses() == null)
            return false;
        if (other.getVolumeStatuses() != null
                && other.getVolumeStatuses().equals(this.getVolumeStatuses()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getVolumeStatuses() == null) ? 0 : getVolumeStatuses()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVolumeStatusResult clone() {
        try {
            return (DescribeVolumeStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}