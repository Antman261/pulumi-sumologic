// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.sumologic.inputs.HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelArgs;
import com.pulumi.sumologic.inputs.HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelsWithConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelArgs extends com.pulumi.resources.ResourceArgs {

    public static final HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelArgs Empty = new HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelArgs();

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
    private @Nullable Output<HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelArgs> nextLevel;

    /**
     * @return Next level without a condition.
     * 
     */
    public Optional<Output<HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelArgs>> nextLevel() {
        return Optional.ofNullable(this.nextLevel);
    }

    /**
     * Zero or more next levels with conditions.
     * 
     */
    @Import(name="nextLevelsWithConditions")
    private @Nullable Output<List<HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelsWithConditionArgs>> nextLevelsWithConditions;

    /**
     * @return Zero or more next levels with conditions.
     * 
     */
    public Optional<Output<List<HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelsWithConditionArgs>>> nextLevelsWithConditions() {
        return Optional.ofNullable(this.nextLevelsWithConditions);
    }

    private HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelArgs() {}

    private HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelArgs(HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelArgs $) {
        this.entityType = $.entityType;
        this.nextLevel = $.nextLevel;
        this.nextLevelsWithConditions = $.nextLevelsWithConditions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelArgs $;

        public Builder() {
            $ = new HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelArgs();
        }

        public Builder(HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelArgs defaults) {
            $ = new HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelArgs(Objects.requireNonNull(defaults));
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
        public Builder nextLevel(@Nullable Output<HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelArgs> nextLevel) {
            $.nextLevel = nextLevel;
            return this;
        }

        /**
         * @param nextLevel Next level without a condition.
         * 
         * @return builder
         * 
         */
        public Builder nextLevel(HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelArgs nextLevel) {
            return nextLevel(Output.of(nextLevel));
        }

        /**
         * @param nextLevelsWithConditions Zero or more next levels with conditions.
         * 
         * @return builder
         * 
         */
        public Builder nextLevelsWithConditions(@Nullable Output<List<HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelsWithConditionArgs>> nextLevelsWithConditions) {
            $.nextLevelsWithConditions = nextLevelsWithConditions;
            return this;
        }

        /**
         * @param nextLevelsWithConditions Zero or more next levels with conditions.
         * 
         * @return builder
         * 
         */
        public Builder nextLevelsWithConditions(List<HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelsWithConditionArgs> nextLevelsWithConditions) {
            return nextLevelsWithConditions(Output.of(nextLevelsWithConditions));
        }

        /**
         * @param nextLevelsWithConditions Zero or more next levels with conditions.
         * 
         * @return builder
         * 
         */
        public Builder nextLevelsWithConditions(HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelsWithConditionArgs... nextLevelsWithConditions) {
            return nextLevelsWithConditions(List.of(nextLevelsWithConditions));
        }

        public HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelArgs build() {
            $.entityType = Objects.requireNonNull($.entityType, "expected parameter 'entityType' to be non-null");
            return $;
        }
    }

}
