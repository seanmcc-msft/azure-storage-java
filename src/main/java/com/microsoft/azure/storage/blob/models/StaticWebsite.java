/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * The properties that enable an account to host a static website.
 */
@JacksonXmlRootElement(localName = "StaticWebsite")
public final class StaticWebsite {
    /**
     * Indicates whether this account is hosting a static website.
     */
    @JsonProperty(value = "Enabled", required = true)
    private boolean enabled;

    /**
     * The default name of the index page under each directory.
     */
    @JsonProperty(value = "IndexDocument")
    private String indexDocument;

    /**
     * The absolute path of the custom 404 page.
     */
    @JsonProperty(value = "ErrorDocument404Path")
    private String errorDocument404Path;

    /**
     * Get the enabled value.
     *
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled value.
     *
     * @param enabled the enabled value to set.
     * @return the StaticWebsite object itself.
     */
    public StaticWebsite withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the indexDocument value.
     *
     * @return the indexDocument value.
     */
    public String indexDocument() {
        return this.indexDocument;
    }

    /**
     * Set the indexDocument value.
     *
     * @param indexDocument the indexDocument value to set.
     * @return the StaticWebsite object itself.
     */
    public StaticWebsite withIndexDocument(String indexDocument) {
        this.indexDocument = indexDocument;
        return this;
    }

    /**
     * Get the errorDocument404Path value.
     *
     * @return the errorDocument404Path value.
     */
    public String errorDocument404Path() {
        return this.errorDocument404Path;
    }

    /**
     * Set the errorDocument404Path value.
     *
     * @param errorDocument404Path the errorDocument404Path value to set.
     * @return the StaticWebsite object itself.
     */
    public StaticWebsite withErrorDocument404Path(String errorDocument404Path) {
        this.errorDocument404Path = errorDocument404Path;
        return this;
    }
}