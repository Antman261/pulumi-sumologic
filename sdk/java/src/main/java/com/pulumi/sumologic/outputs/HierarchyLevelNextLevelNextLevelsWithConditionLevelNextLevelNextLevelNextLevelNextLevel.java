// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.sumologic.outputs.HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevel;
import com.pulumi.sumologic.outputs.HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithCondition;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevel {
    /**
     * @return Indicates the name and type for all entities at this hierarchy level, e.g. service or pod in case of kubernetes entities.
     * 
     */
    private String entityType;
    /**
     * @return Next level without a condition.
     * 
     */
    private @Nullable HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevel nextLevel;
    /**
     * @return Zero or more next levels with conditions.
     * 
     */
    private @Nullable List<HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithCondition> nextLevelsWithConditions;

    private HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevel() {}
    /**
     * @return Indicates the name and type for all entities at this hierarchy level, e.g. service or pod in case of kubernetes entities.
     * 
     */
    public String entityType() {
        return this.entityType;
    }
    /**
     * @return Next level without a condition.
     * 
     */
    public Optional<HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevel> nextLevel() {
        return Optional.ofNullable(this.nextLevel);
    }
    /**
     * @return Zero or more next levels with conditions.
     * 
     */
    public List<HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithCondition> nextLevelsWithConditions() {
        return this.nextLevelsWithConditions == null ? List.of() : this.nextLevelsWithConditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevel defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String entityType;
        private @Nullable HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevel nextLevel;
        private @Nullable List<HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithCondition> nextLevelsWithConditions;
        public Builder() {}
        public Builder(HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entityType = defaults.entityType;
    	      this.nextLevel = defaults.nextLevel;
    	      this.nextLevelsWithConditions = defaults.nextLevelsWithConditions;
        }

        @CustomType.Setter
        public Builder entityType(String entityType) {
            this.entityType = Objects.requireNonNull(entityType);
            return this;
        }
        @CustomType.Setter
        public Builder nextLevel(@Nullable HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevel nextLevel) {
            this.nextLevel = nextLevel;
            return this;
        }
        @CustomType.Setter
        public Builder nextLevelsWithConditions(@Nullable List<HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithCondition> nextLevelsWithConditions) {
            this.nextLevelsWithConditions = nextLevelsWithConditions;
            return this;
        }
        public Builder nextLevelsWithConditions(HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithCondition... nextLevelsWithConditions) {
            return nextLevelsWithConditions(List.of(nextLevelsWithConditions));
        }
        public HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevel build() {
            final var o = new HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevel();
            o.entityType = entityType;
            o.nextLevel = nextLevel;
            o.nextLevelsWithConditions = nextLevelsWithConditions;
            return o;
        }
    }
}