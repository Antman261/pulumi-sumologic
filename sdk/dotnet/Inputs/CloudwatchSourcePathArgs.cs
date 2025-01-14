// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class CloudwatchSourcePathArgs : global::Pulumi.ResourceArgs
    {
        [Input("bucketName")]
        public Input<string>? BucketName { get; set; }

        [Input("customServices")]
        private InputList<Inputs.CloudwatchSourcePathCustomServiceArgs>? _customServices;
        public InputList<Inputs.CloudwatchSourcePathCustomServiceArgs> CustomServices
        {
            get => _customServices ?? (_customServices = new InputList<Inputs.CloudwatchSourcePathCustomServiceArgs>());
            set => _customServices = value;
        }

        [Input("limitToNamespaces")]
        private InputList<string>? _limitToNamespaces;

        /// <summary>
        /// List of namespaces. By default all namespaces are selected. Details can be found [here](https://help.sumologic.com/03Send-Data/Sources/02Sources-for-Hosted-Collectors/Amazon-Web-Services/Amazon-CloudWatch-Source-for-Metrics#aws%C2%A0tag-filtering-namespace-support). You can also  specify custom namespace.
        /// </summary>
        public InputList<string> LimitToNamespaces
        {
            get => _limitToNamespaces ?? (_limitToNamespaces = new InputList<string>());
            set => _limitToNamespaces = value;
        }

        [Input("limitToRegions")]
        private InputList<string>? _limitToRegions;

        /// <summary>
        /// List of Amazon regions.
        /// </summary>
        public InputList<string> LimitToRegions
        {
            get => _limitToRegions ?? (_limitToRegions = new InputList<string>());
            set => _limitToRegions = value;
        }

        [Input("limitToServices")]
        private InputList<string>? _limitToServices;
        public InputList<string> LimitToServices
        {
            get => _limitToServices ?? (_limitToServices = new InputList<string>());
            set => _limitToServices = value;
        }

        [Input("pathExpression")]
        public Input<string>? PathExpression { get; set; }

        [Input("snsTopicOrSubscriptionArns")]
        private InputList<Inputs.CloudwatchSourcePathSnsTopicOrSubscriptionArnArgs>? _snsTopicOrSubscriptionArns;
        public InputList<Inputs.CloudwatchSourcePathSnsTopicOrSubscriptionArnArgs> SnsTopicOrSubscriptionArns
        {
            get => _snsTopicOrSubscriptionArns ?? (_snsTopicOrSubscriptionArns = new InputList<Inputs.CloudwatchSourcePathSnsTopicOrSubscriptionArnArgs>());
            set => _snsTopicOrSubscriptionArns = value;
        }

        [Input("tagFilters")]
        private InputList<Inputs.CloudwatchSourcePathTagFilterArgs>? _tagFilters;

        /// <summary>
        /// Tag filters allow you to filter the CloudWatch metrics you collect by the AWS tags you have assigned to your AWS resources. You can define tag filters for each supported namespace. If you do not define any tag filters, all metrics will be collected for the regions and namespaces you configured for the source above. More info on tag filters can be found [here](https://help.sumologic.com/03Send-Data/Sources/02Sources-for-Hosted-Collectors/Amazon-Web-Services/Amazon-CloudWatch-Source-for-Metrics#about-aws-tag-filtering)
        /// </summary>
        public InputList<Inputs.CloudwatchSourcePathTagFilterArgs> TagFilters
        {
            get => _tagFilters ?? (_tagFilters = new InputList<Inputs.CloudwatchSourcePathTagFilterArgs>());
            set => _tagFilters = value;
        }

        /// <summary>
        /// This value has to be set to `TagFilters`
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        [Input("useVersionedApi")]
        public Input<bool>? UseVersionedApi { get; set; }

        public CloudwatchSourcePathArgs()
        {
        }
        public static new CloudwatchSourcePathArgs Empty => new CloudwatchSourcePathArgs();
    }
}
