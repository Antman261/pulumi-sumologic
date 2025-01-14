// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Condition to be checked against for level.entityType value, for now full string match.
        /// </summary>
        [Input("condition", required: true)]
        public Input<string> Condition { get; set; } = null!;

        [Input("level", required: true)]
        public Input<Inputs.HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelGetArgs> Level { get; set; } = null!;

        public HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionGetArgs()
        {
        }
        public static new HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionGetArgs Empty => new HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionGetArgs();
    }
}
