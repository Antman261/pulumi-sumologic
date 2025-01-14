// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelArgs extends com.pulumi.resources.ResourceArgs {

    public static final HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelArgs Empty = new HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelArgs();

    /**
     * Indicates the name and type for all entities at this hierarchy level, e.g. service or pod in case of kubernetes entities.
     * 
     */
    @Import(name="entityType", required=true)
    private Output<String> entityType;

    /**
     * @return Indicates the name and type for all entities at this hierarchy level, e.g. service or pod in case of kubernetes entities.
     * 
     */
    public Output<String> entityType() {
        return this.entityType;
    }

    /**
     * Zero or more next levels with conditions.
     * 
     */
    @Import(name="nextLevelsWithConditions")
    private @Nullable Output<List<String>> nextLevelsWithConditions;

    /**
     * @return Zero or more next levels with conditions.
     * 
     */
    public Optional<Output<List<String>>> nextLevelsWithConditions() {
        return Optional.ofNullable(this.nextLevelsWithConditions);
    }

    private HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelArgs() {}

    private HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelArgs(HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelArgs $) {
        this.entityType = $.entityType;
        this.nextLevelsWithConditions = $.nextLevelsWithConditions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelArgs $;

        public Builder() {
            $ = new HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelArgs();
        }

        public Builder(HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelArgs defaults) {
            $ = new HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param entityType Indicates the name and type for all entities at this hierarchy level, e.g. service or pod in case of kubernetes entities.
         * 
         * @return builder
         * 
         */
        public Builder entityType(Output<String> entityType) {
            $.entityType = entityType;
            return this;
        }

        /**
         * @param entityType Indicates the name and type for all entities at this hierarchy level, e.g. service or pod in case of kubernetes entities.
         * 
         * @return builder
         * 
         */
        public Builder entityType(String entityType) {
            return entityType(Output.of(entityType));
        }

        /**
         * @param nextLevelsWithConditions Zero or more next levels with conditions.
         * 
         * @return builder
         * 
         */
        public Builder nextLevelsWithConditions(@Nullable Output<List<String>> nextLevelsWithConditions) {
            $.nextLevelsWithConditions = nextLevelsWithConditions;
            return this;
        }

        /**
         * @param nextLevelsWithConditions Zero or more next levels with conditions.
         * 
         * @return builder
         * 
         */
        public Builder nextLevelsWithConditions(List<String> nextLevelsWithConditions) {
            return nextLevelsWithConditions(Output.of(nextLevelsWithConditions));
        }

        /**
         * @param nextLevelsWithConditions Zero or more next levels with conditions.
         * 
         * @return builder
         * 
         */
        public Builder nextLevelsWithConditions(String... nextLevelsWithConditions) {
            return nextLevelsWithConditions(List.of(nextLevelsWithConditions));
        }

        public HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelArgs build() {
            $.entityType = Objects.requireNonNull($.entityType, "expected parameter 'entityType' to be non-null");
            return $;
        }
    }

}
