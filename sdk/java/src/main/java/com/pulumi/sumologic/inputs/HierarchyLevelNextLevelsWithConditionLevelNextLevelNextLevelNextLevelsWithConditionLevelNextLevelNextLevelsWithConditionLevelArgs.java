// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.sumologic.inputs.HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelArgs;
import com.pulumi.sumologic.inputs.HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelArgs extends com.pulumi.resources.ResourceArgs {

    public static final HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelArgs Empty = new HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelArgs();

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
     * Next level without a condition.
     * 
     */
    @Import(name="nextLevel")
    private @Nullable Output<HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelArgs> nextLevel;

    /**
     * @return Next level without a condition.
     * 
     */
    public Optional<Output<HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelArgs>> nextLevel() {
        return Optional.ofNullable(this.nextLevel);
    }

    /**
     * Zero or more next levels with conditions.
     * 
     */
    @Import(name="nextLevelsWithConditions")
    private @Nullable Output<List<HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionArgs>> nextLevelsWithConditions;

    /**
     * @return Zero or more next levels with conditions.
     * 
     */
    public Optional<Output<List<HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionArgs>>> nextLevelsWithConditions() {
        return Optional.ofNullable(this.nextLevelsWithConditions);
    }

    private HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelArgs() {}

    private HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelArgs(HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelArgs $) {
        this.entityType = $.entityType;
        this.nextLevel = $.nextLevel;
        this.nextLevelsWithConditions = $.nextLevelsWithConditions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelArgs $;

        public Builder() {
            $ = new HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelArgs();
        }

        public Builder(HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelArgs defaults) {
            $ = new HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelArgs(Objects.requireNonNull(defaults));
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
         * @param nextLevel Next level without a condition.
         * 
         * @return builder
         * 
         */
        public Builder nextLevel(@Nullable Output<HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelArgs> nextLevel) {
            $.nextLevel = nextLevel;
            return this;
        }

        /**
         * @param nextLevel Next level without a condition.
         * 
         * @return builder
         * 
         */
        public Builder nextLevel(HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelArgs nextLevel) {
            return nextLevel(Output.of(nextLevel));
        }

        /**
         * @param nextLevelsWithConditions Zero or more next levels with conditions.
         * 
         * @return builder
         * 
         */
        public Builder nextLevelsWithConditions(@Nullable Output<List<HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionArgs>> nextLevelsWithConditions) {
            $.nextLevelsWithConditions = nextLevelsWithConditions;
            return this;
        }

        /**
         * @param nextLevelsWithConditions Zero or more next levels with conditions.
         * 
         * @return builder
         * 
         */
        public Builder nextLevelsWithConditions(List<HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionArgs> nextLevelsWithConditions) {
            return nextLevelsWithConditions(Output.of(nextLevelsWithConditions));
        }

        /**
         * @param nextLevelsWithConditions Zero or more next levels with conditions.
         * 
         * @return builder
         * 
         */
        public Builder nextLevelsWithConditions(HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionArgs... nextLevelsWithConditions) {
            return nextLevelsWithConditions(List.of(nextLevelsWithConditions));
        }

        public HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelArgs build() {
            $.entityType = Objects.requireNonNull($.entityType, "expected parameter 'entityType' to be non-null");
            return $;
        }
    }

}