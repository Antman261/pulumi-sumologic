// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class SloIndicatorWindowBasedEvaluationArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Aggregation function applied over each window to arrive at SLI. Valid values are `Avg`
        /// , `Sum`, `Count`, `Max`, `Min` and `p[1-99]`.
        /// </summary>
        [Input("aggregation")]
        public Input<string>? Aggregation { get; set; }

        /// <summary>
        /// Comparison function with threshold. Valid values are `LessThan`, `LessThanOrEqual`, `GreaterThan`
        /// , `GreaterThanOrEqual`.
        /// </summary>
        [Input("op", required: true)]
        public Input<string> Op { get; set; } = null!;

        [Input("queries", required: true)]
        private InputList<Inputs.SloIndicatorWindowBasedEvaluationQueryArgs>? _queries;

        /// <summary>
        /// The queries to use.
        /// </summary>
        public InputList<Inputs.SloIndicatorWindowBasedEvaluationQueryArgs> Queries
        {
            get => _queries ?? (_queries = new InputList<Inputs.SloIndicatorWindowBasedEvaluationQueryArgs>());
            set => _queries = value;
        }

        /// <summary>
        /// The type of query to use. Valid values are `Metrics` or `Logs`.
        /// </summary>
        [Input("queryType", required: true)]
        public Input<string> QueryType { get; set; } = null!;

        /// <summary>
        /// The size of the window to use, minimum of `1m` and maximum of `1h`. Only applicable for Window
        /// based evaluation.
        /// </summary>
        [Input("size", required: true)]
        public Input<string> Size { get; set; } = null!;

        /// <summary>
        /// Compared against threshold query's raw data points to determine success criteria.
        /// </summary>
        [Input("threshold", required: true)]
        public Input<double> Threshold { get; set; } = null!;

        public SloIndicatorWindowBasedEvaluationArgs()
        {
        }
    }
}