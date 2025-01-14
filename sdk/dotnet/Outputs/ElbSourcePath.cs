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
    public sealed class ElbSourcePath
    {
        /// <summary>
        /// The name of the bucket.
        /// </summary>
        public readonly string? BucketName;
        public readonly ImmutableArray<Outputs.ElbSourcePathCustomService> CustomServices;
        public readonly ImmutableArray<string> LimitToNamespaces;
        public readonly ImmutableArray<string> LimitToRegions;
        public readonly ImmutableArray<string> LimitToServices;
        /// <summary>
        /// The path to the data.
        /// </summary>
        public readonly string? PathExpression;
        /// <summary>
        /// This is a computed field for SNS topic/subscription ARN.
        /// </summary>
        public readonly ImmutableArray<Outputs.ElbSourcePathSnsTopicOrSubscriptionArn> SnsTopicOrSubscriptionArns;
        public readonly ImmutableArray<Outputs.ElbSourcePathTagFilter> TagFilters;
        /// <summary>
        /// type of polling source. This has to be `S3BucketPathExpression` for `ELB` source.
        /// </summary>
        public readonly string Type;
        public readonly bool? UseVersionedApi;

        [OutputConstructor]
        private ElbSourcePath(
            string? bucketName,

            ImmutableArray<Outputs.ElbSourcePathCustomService> customServices,

            ImmutableArray<string> limitToNamespaces,

            ImmutableArray<string> limitToRegions,

            ImmutableArray<string> limitToServices,

            string? pathExpression,

            ImmutableArray<Outputs.ElbSourcePathSnsTopicOrSubscriptionArn> snsTopicOrSubscriptionArns,

            ImmutableArray<Outputs.ElbSourcePathTagFilter> tagFilters,

            string type,

            bool? useVersionedApi)
        {
            BucketName = bucketName;
            CustomServices = customServices;
            LimitToNamespaces = limitToNamespaces;
            LimitToRegions = limitToRegions;
            LimitToServices = limitToServices;
            PathExpression = pathExpression;
            SnsTopicOrSubscriptionArns = snsTopicOrSubscriptionArns;
            TagFilters = tagFilters;
            Type = type;
            UseVersionedApi = useVersionedApi;
        }
    }
}
