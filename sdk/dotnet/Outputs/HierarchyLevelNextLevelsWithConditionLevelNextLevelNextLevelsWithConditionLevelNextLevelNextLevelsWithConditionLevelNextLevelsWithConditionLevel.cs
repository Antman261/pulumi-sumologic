// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Outputs
{

    [OutputType]
    public sealed class HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevel
    {
        /// <summary>
        /// Indicates the name and type for all entities at this hierarchy level, e.g. service or pod in case of kubernetes entities.
        /// </summary>
        public readonly string EntityType;
        /// <summary>
        /// Next level without a condition.
        /// </summary>
        public readonly Outputs.HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevel? NextLevel;
        /// <summary>
        /// Zero or more next levels with conditions.
        /// </summary>
        public readonly ImmutableArray<Outputs.HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithCondition> NextLevelsWithConditions;

        [OutputConstructor]
        private HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevel(
            string entityType,

            Outputs.HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevel? nextLevel,

            ImmutableArray<Outputs.HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithCondition> nextLevelsWithConditions)
        {
            EntityType = entityType;
            NextLevel = nextLevel;
            NextLevelsWithConditions = nextLevelsWithConditions;
        }
    }
}