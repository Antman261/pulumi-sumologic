// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.sumologic.inputs.HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelArgs;
import com.pulumi.sumologic.inputs.HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelArgs extends com.pulumi.resources.ResourceArgs {

    public static final HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelArgs Empty = new HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelArgs();

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
    private @Nullable Output<HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelArgs> nextLevel;

    /**
     * @return Next level without a condition.
     * 
     */
    public Optional<Output<HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelArgs>> nextLevel() {
        return Optional.ofNullable(this.nextLevel);
    }

    /**
     * Zero or more next levels with conditions.
     * 
     */
    @Import(name="nextLevelsWithConditions")
    private @Nullable Output<List<HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionArgs>> nextLevelsWithConditions;

    /**
     * @return Zero or more next levels with conditions.
     * 
     */
    public Optional<Output<List<HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionArgs>>> nextLevelsWithConditions() {
        return Optional.ofNullable(this.nextLevelsWithConditions);
    }

    private HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelArgs() {}

    private HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelArgs(HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelArgs $) {
        this.entityType = $.entityType;
        this.nextLevel = $.nextLevel;
        this.nextLevelsWithConditions = $.nextLevelsWithConditions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelArgs $;

        public Builder() {
            $ = new HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelArgs();
        }

        public Builder(HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelArgs defaults) {
            $ = new HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelArgs(Objects.requireNonNull(defaults));
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
        public Builder nextLevel(@Nullable Output<HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelArgs> nextLevel) {
            $.nextLevel = nextLevel;
            return this;
        }

        /**
         * @param nextLevel Next level without a condition.
         * 
         * @return builder
         * 
         */
        public Builder nextLevel(HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelArgs nextLevel) {
            return nextLevel(Output.of(nextLevel));
        }

        /**
         * @param nextLevelsWithConditions Zero or more next levels with conditions.
         * 
         * @return builder
         * 
         */
        public Builder nextLevelsWithConditions(@Nullable Output<List<HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionArgs>> nextLevelsWithConditions) {
            $.nextLevelsWithConditions = nextLevelsWithConditions;
            return this;
        }

        /**
         * @param nextLevelsWithConditions Zero or more next levels with conditions.
         * 
         * @return builder
         * 
         */
        public Builder nextLevelsWithConditions(List<HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionArgs> nextLevelsWithConditions) {
            return nextLevelsWithConditions(Output.of(nextLevelsWithConditions));
        }

        /**
         * @param nextLevelsWithConditions Zero or more next levels with conditions.
         * 
         * @return builder
         * 
         */
        public Builder nextLevelsWithConditions(HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionArgs... nextLevelsWithConditions) {
            return nextLevelsWithConditions(List.of(nextLevelsWithConditions));
        }

        public HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelArgs build() {
            $.entityType = Objects.requireNonNull($.entityType, "expected parameter 'entityType' to be non-null");
            return $;
        }
    }

}
