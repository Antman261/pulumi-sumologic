// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SloFolderArgs extends com.pulumi.resources.ResourceArgs {

    public static final SloFolderArgs Empty = new SloFolderArgs();

    @Import(name="contentType")
    private @Nullable Output<String> contentType;

    public Optional<Output<String>> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    @Import(name="createdBy")
    private @Nullable Output<String> createdBy;

    public Optional<Output<String>> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }

    /**
     * The description of the SLO folder.
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return The description of the SLO folder.
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    @Import(name="isLocked")
    private @Nullable Output<Boolean> isLocked;

    public Optional<Output<Boolean>> isLocked() {
        return Optional.ofNullable(this.isLocked);
    }

    @Import(name="isMutable")
    private @Nullable Output<Boolean> isMutable;

    public Optional<Output<Boolean>> isMutable() {
        return Optional.ofNullable(this.isMutable);
    }

    @Import(name="isSystem")
    private @Nullable Output<Boolean> isSystem;

    public Optional<Output<Boolean>> isSystem() {
        return Optional.ofNullable(this.isSystem);
    }

    @Import(name="modifiedAt")
    private @Nullable Output<String> modifiedAt;

    public Optional<Output<String>> modifiedAt() {
        return Optional.ofNullable(this.modifiedAt);
    }

    @Import(name="modifiedBy")
    private @Nullable Output<String> modifiedBy;

    public Optional<Output<String>> modifiedBy() {
        return Optional.ofNullable(this.modifiedBy);
    }

    /**
     * The name of the SLO folder. The name must be alphanumeric.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the SLO folder. The name must be alphanumeric.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The identifier of the SLO Folder that contains this SLO Folder. Defaults to the root folder.
     * 
     */
    @Import(name="parentId")
    private @Nullable Output<String> parentId;

    /**
     * @return The identifier of the SLO Folder that contains this SLO Folder. Defaults to the root folder.
     * 
     */
    public Optional<Output<String>> parentId() {
        return Optional.ofNullable(this.parentId);
    }

    @Import(name="postRequestMap")
    private @Nullable Output<Map<String,String>> postRequestMap;

    public Optional<Output<Map<String,String>>> postRequestMap() {
        return Optional.ofNullable(this.postRequestMap);
    }

    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    @Import(name="version")
    private @Nullable Output<Integer> version;

    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private SloFolderArgs() {}

    private SloFolderArgs(SloFolderArgs $) {
        this.contentType = $.contentType;
        this.createdAt = $.createdAt;
        this.createdBy = $.createdBy;
        this.description = $.description;
        this.isLocked = $.isLocked;
        this.isMutable = $.isMutable;
        this.isSystem = $.isSystem;
        this.modifiedAt = $.modifiedAt;
        this.modifiedBy = $.modifiedBy;
        this.name = $.name;
        this.parentId = $.parentId;
        this.postRequestMap = $.postRequestMap;
        this.type = $.type;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SloFolderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SloFolderArgs $;

        public Builder() {
            $ = new SloFolderArgs();
        }

        public Builder(SloFolderArgs defaults) {
            $ = new SloFolderArgs(Objects.requireNonNull(defaults));
        }

        public Builder contentType(@Nullable Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        public Builder createdBy(@Nullable Output<String> createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        public Builder createdBy(String createdBy) {
            return createdBy(Output.of(createdBy));
        }

        /**
         * @param description The description of the SLO folder.
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the SLO folder.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder isLocked(@Nullable Output<Boolean> isLocked) {
            $.isLocked = isLocked;
            return this;
        }

        public Builder isLocked(Boolean isLocked) {
            return isLocked(Output.of(isLocked));
        }

        public Builder isMutable(@Nullable Output<Boolean> isMutable) {
            $.isMutable = isMutable;
            return this;
        }

        public Builder isMutable(Boolean isMutable) {
            return isMutable(Output.of(isMutable));
        }

        public Builder isSystem(@Nullable Output<Boolean> isSystem) {
            $.isSystem = isSystem;
            return this;
        }

        public Builder isSystem(Boolean isSystem) {
            return isSystem(Output.of(isSystem));
        }

        public Builder modifiedAt(@Nullable Output<String> modifiedAt) {
            $.modifiedAt = modifiedAt;
            return this;
        }

        public Builder modifiedAt(String modifiedAt) {
            return modifiedAt(Output.of(modifiedAt));
        }

        public Builder modifiedBy(@Nullable Output<String> modifiedBy) {
            $.modifiedBy = modifiedBy;
            return this;
        }

        public Builder modifiedBy(String modifiedBy) {
            return modifiedBy(Output.of(modifiedBy));
        }

        /**
         * @param name The name of the SLO folder. The name must be alphanumeric.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the SLO folder. The name must be alphanumeric.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parentId The identifier of the SLO Folder that contains this SLO Folder. Defaults to the root folder.
         * 
         * @return builder
         * 
         */
        public Builder parentId(@Nullable Output<String> parentId) {
            $.parentId = parentId;
            return this;
        }

        /**
         * @param parentId The identifier of the SLO Folder that contains this SLO Folder. Defaults to the root folder.
         * 
         * @return builder
         * 
         */
        public Builder parentId(String parentId) {
            return parentId(Output.of(parentId));
        }

        public Builder postRequestMap(@Nullable Output<Map<String,String>> postRequestMap) {
            $.postRequestMap = postRequestMap;
            return this;
        }

        public Builder postRequestMap(Map<String,String> postRequestMap) {
            return postRequestMap(Output.of(postRequestMap));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public SloFolderArgs build() {
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            return $;
        }
    }

}
