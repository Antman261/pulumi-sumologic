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
    public sealed class HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithCondition
    {
        /// <summary>
        /// Condition to be checked against for level.entityType value, for now full string match.
        /// </summary>
        public readonly string Condition;
        public readonly Outputs.HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevel Level;

        [OutputConstructor]
        private HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithCondition(
            string condition,

            Outputs.HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevel level)
        {
            Condition = condition;
            Level = level;
        }
    }
}