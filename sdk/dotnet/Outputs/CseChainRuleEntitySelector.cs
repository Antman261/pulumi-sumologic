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
    public sealed class CseChainRuleEntitySelector
    {
        public readonly string EntityType;
        public readonly string Expression;

        [OutputConstructor]
        private CseChainRuleEntitySelector(
            string entityType,

            string expression)
        {
            EntityType = entityType;
            Expression = expression;
        }
    }
}