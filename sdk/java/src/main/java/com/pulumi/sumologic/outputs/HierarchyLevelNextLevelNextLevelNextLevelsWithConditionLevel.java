// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.sumologic.outputs.HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevel;
import com.pulumi.sumologic.outputs.HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithCondition;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevel {
    /**
     * @return Indicates the name and type for all entities at this hierarchy level, e.g. service or pod in case of kubernetes entities.
     * 
     */
    private final String entityType;
    /**
     * @return Next level without a condition.
     * 
     */
    private final @Nullable HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevel nextLevel;
    /**
     * @return Zero or more next levels with conditions.
     * 
     */
    private final @Nullable List<HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithCondition> nextLevelsWithConditions;

    @CustomType.Constructor
    private HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevel(
        @CustomType.Parameter("entityType") String entityType,
        @CustomType.Parameter("nextLevel") @Nullable HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevel nextLevel,
        @CustomType.Parameter("nextLevelsWithConditions") @Nullable List<HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithCondition> nextLevelsWithConditions) {
        this.entityType = entityType;
        this.nextLevel = nextLevel;
        this.nextLevelsWithConditions = nextLevelsWithConditions;
    }

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
    public Optional<HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevel> nextLevel() {
        return Optional.ofNullable(this.nextLevel);
    }
    /**
     * @return Zero or more next levels with conditions.
     * 
     */
    public List<HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithCondition> nextLevelsWithConditions() {
        return this.nextLevelsWithConditions == null ? List.of() : this.nextLevelsWithConditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevel defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String entityType;
        private @Nullable HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevel nextLevel;
        private @Nullable List<HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithCondition> nextLevelsWithConditions;

        public Builder() {
    	      // Empty
        }

        public Builder(HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entityType = defaults.entityType;
    	      this.nextLevel = defaults.nextLevel;
    	      this.nextLevelsWithConditions = defaults.nextLevelsWithConditions;
        }

        public Builder entityType(String entityType) {
            this.entityType = Objects.requireNonNull(entityType);
            return this;
        }
        public Builder nextLevel(@Nullable HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevel nextLevel) {
            this.nextLevel = nextLevel;
            return this;
        }
        public Builder nextLevelsWithConditions(@Nullable List<HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithCondition> nextLevelsWithConditions) {
            this.nextLevelsWithConditions = nextLevelsWithConditions;
            return this;
        }
        public Builder nextLevelsWithConditions(HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithCondition... nextLevelsWithConditions) {
            return nextLevelsWithConditions(List.of(nextLevelsWithConditions));
        }        public HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevel build() {
            return new HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevel(entityType, nextLevel, nextLevelsWithConditions);
        }
    }
}