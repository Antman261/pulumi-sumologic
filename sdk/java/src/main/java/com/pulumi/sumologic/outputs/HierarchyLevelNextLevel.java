// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.sumologic.outputs.HierarchyLevelNextLevelNextLevel;
import com.pulumi.sumologic.outputs.HierarchyLevelNextLevelNextLevelsWithCondition;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HierarchyLevelNextLevel {
    /**
     * @return Indicates the name and type for all entities at this hierarchy level, e.g. service or pod in case of kubernetes entities.
     * 
     */
    private final String entityType;
    /**
     * @return Next level without a condition.
     * 
     */
    private final @Nullable HierarchyLevelNextLevelNextLevel nextLevel;
    /**
     * @return Zero or more next levels with conditions.
     * 
     */
    private final @Nullable List<HierarchyLevelNextLevelNextLevelsWithCondition> nextLevelsWithConditions;

    @CustomType.Constructor
    private HierarchyLevelNextLevel(
        @CustomType.Parameter("entityType") String entityType,
        @CustomType.Parameter("nextLevel") @Nullable HierarchyLevelNextLevelNextLevel nextLevel,
        @CustomType.Parameter("nextLevelsWithConditions") @Nullable List<HierarchyLevelNextLevelNextLevelsWithCondition> nextLevelsWithConditions) {
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
    public Optional<HierarchyLevelNextLevelNextLevel> nextLevel() {
        return Optional.ofNullable(this.nextLevel);
    }
    /**
     * @return Zero or more next levels with conditions.
     * 
     */
    public List<HierarchyLevelNextLevelNextLevelsWithCondition> nextLevelsWithConditions() {
        return this.nextLevelsWithConditions == null ? List.of() : this.nextLevelsWithConditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HierarchyLevelNextLevel defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String entityType;
        private @Nullable HierarchyLevelNextLevelNextLevel nextLevel;
        private @Nullable List<HierarchyLevelNextLevelNextLevelsWithCondition> nextLevelsWithConditions;

        public Builder() {
    	      // Empty
        }

        public Builder(HierarchyLevelNextLevel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entityType = defaults.entityType;
    	      this.nextLevel = defaults.nextLevel;
    	      this.nextLevelsWithConditions = defaults.nextLevelsWithConditions;
        }

        public Builder entityType(String entityType) {
            this.entityType = Objects.requireNonNull(entityType);
            return this;
        }
        public Builder nextLevel(@Nullable HierarchyLevelNextLevelNextLevel nextLevel) {
            this.nextLevel = nextLevel;
            return this;
        }
        public Builder nextLevelsWithConditions(@Nullable List<HierarchyLevelNextLevelNextLevelsWithCondition> nextLevelsWithConditions) {
            this.nextLevelsWithConditions = nextLevelsWithConditions;
            return this;
        }
        public Builder nextLevelsWithConditions(HierarchyLevelNextLevelNextLevelsWithCondition... nextLevelsWithConditions) {
            return nextLevelsWithConditions(List.of(nextLevelsWithConditions));
        }        public HierarchyLevelNextLevel build() {
            return new HierarchyLevelNextLevel(entityType, nextLevel, nextLevelsWithConditions);
        }
    }
}