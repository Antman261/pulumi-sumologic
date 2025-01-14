// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic
{
    /// <summary>
    /// Provides the ability to create, read, delete, and update [SLOs](https://help.sumologic.com/Beta/SLO_Reliability_Management).
    /// </summary>
    [SumoLogicResourceType("sumologic:index/slo:Slo")]
    public partial class Slo : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Name of the application.
        /// Defaults to true.
        /// </summary>
        [Output("application")]
        public Output<string> Application { get; private set; } = null!;

        /// <summary>
        /// The compliance settings for the SLO.
        /// </summary>
        [Output("compliances")]
        public Output<ImmutableArray<Outputs.SloCompliance>> Compliances { get; private set; } = null!;

        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        [Output("createdBy")]
        public Output<string> CreatedBy { get; private set; } = null!;

        /// <summary>
        /// The description of the SLO.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The service level indicator on which SLO is to be defined. more details on the difference
        /// b/w them can be found on
        /// the [slo help page](https://help.sumologic.com/Beta/SLO_Reliability_Management/Access_and_Create_SLOs)
        /// - window_based_evaluation - Evaluate SLI using successful/total windows.
        /// - request_based_evaluation - Evaluate SLI based on occurrence of successful
        /// events / total events over entire compliance period.
        /// </summary>
        [Output("indicator")]
        public Output<Outputs.SloIndicator> Indicator { get; private set; } = null!;

        [Output("isLocked")]
        public Output<bool?> IsLocked { get; private set; } = null!;

        [Output("isMutable")]
        public Output<bool> IsMutable { get; private set; } = null!;

        [Output("isSystem")]
        public Output<bool> IsSystem { get; private set; } = null!;

        [Output("modifiedAt")]
        public Output<string> ModifiedAt { get; private set; } = null!;

        [Output("modifiedBy")]
        public Output<string> ModifiedBy { get; private set; } = null!;

        /// <summary>
        /// The name of the SLO. The name must be alphanumeric.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the SLO Folder that contains this SLO. Defaults to the root folder.
        /// </summary>
        [Output("parentId")]
        public Output<string> ParentId { get; private set; } = null!;

        [Output("postRequestMap")]
        public Output<ImmutableDictionary<string, string>?> PostRequestMap { get; private set; } = null!;

        /// <summary>
        /// Name of the service.
        /// </summary>
        [Output("service")]
        public Output<string> Service { get; private set; } = null!;

        /// <summary>
        /// The type of SLO. Valid values are `Latency`, `Error`, `Throughput`, `Availability`
        /// , `Other`. Defaults to `Latency`.
        /// </summary>
        [Output("signalType")]
        public Output<string> SignalType { get; private set; } = null!;

        [Output("version")]
        public Output<int> Version { get; private set; } = null!;


        /// <summary>
        /// Create a Slo resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Slo(string name, SloArgs args, CustomResourceOptions? options = null)
            : base("sumologic:index/slo:Slo", name, args ?? new SloArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Slo(string name, Input<string> id, SloState? state = null, CustomResourceOptions? options = null)
            : base("sumologic:index/slo:Slo", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Slo resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Slo Get(string name, Input<string> id, SloState? state = null, CustomResourceOptions? options = null)
        {
            return new Slo(name, id, state, options);
        }
    }

    public sealed class SloArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the application.
        /// Defaults to true.
        /// </summary>
        [Input("application")]
        public Input<string>? Application { get; set; }

        [Input("compliances", required: true)]
        private InputList<Inputs.SloComplianceArgs>? _compliances;

        /// <summary>
        /// The compliance settings for the SLO.
        /// </summary>
        public InputList<Inputs.SloComplianceArgs> Compliances
        {
            get => _compliances ?? (_compliances = new InputList<Inputs.SloComplianceArgs>());
            set => _compliances = value;
        }

        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        [Input("createdBy")]
        public Input<string>? CreatedBy { get; set; }

        /// <summary>
        /// The description of the SLO.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The service level indicator on which SLO is to be defined. more details on the difference
        /// b/w them can be found on
        /// the [slo help page](https://help.sumologic.com/Beta/SLO_Reliability_Management/Access_and_Create_SLOs)
        /// - window_based_evaluation - Evaluate SLI using successful/total windows.
        /// - request_based_evaluation - Evaluate SLI based on occurrence of successful
        /// events / total events over entire compliance period.
        /// </summary>
        [Input("indicator", required: true)]
        public Input<Inputs.SloIndicatorArgs> Indicator { get; set; } = null!;

        [Input("isLocked")]
        public Input<bool>? IsLocked { get; set; }

        [Input("isMutable")]
        public Input<bool>? IsMutable { get; set; }

        [Input("isSystem")]
        public Input<bool>? IsSystem { get; set; }

        [Input("modifiedAt")]
        public Input<string>? ModifiedAt { get; set; }

        [Input("modifiedBy")]
        public Input<string>? ModifiedBy { get; set; }

        /// <summary>
        /// The name of the SLO. The name must be alphanumeric.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the SLO Folder that contains this SLO. Defaults to the root folder.
        /// </summary>
        [Input("parentId")]
        public Input<string>? ParentId { get; set; }

        [Input("postRequestMap")]
        private InputMap<string>? _postRequestMap;
        public InputMap<string> PostRequestMap
        {
            get => _postRequestMap ?? (_postRequestMap = new InputMap<string>());
            set => _postRequestMap = value;
        }

        /// <summary>
        /// Name of the service.
        /// </summary>
        [Input("service")]
        public Input<string>? Service { get; set; }

        /// <summary>
        /// The type of SLO. Valid values are `Latency`, `Error`, `Throughput`, `Availability`
        /// , `Other`. Defaults to `Latency`.
        /// </summary>
        [Input("signalType", required: true)]
        public Input<string> SignalType { get; set; } = null!;

        [Input("version")]
        public Input<int>? Version { get; set; }

        public SloArgs()
        {
        }
        public static new SloArgs Empty => new SloArgs();
    }

    public sealed class SloState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the application.
        /// Defaults to true.
        /// </summary>
        [Input("application")]
        public Input<string>? Application { get; set; }

        [Input("compliances")]
        private InputList<Inputs.SloComplianceGetArgs>? _compliances;

        /// <summary>
        /// The compliance settings for the SLO.
        /// </summary>
        public InputList<Inputs.SloComplianceGetArgs> Compliances
        {
            get => _compliances ?? (_compliances = new InputList<Inputs.SloComplianceGetArgs>());
            set => _compliances = value;
        }

        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        [Input("createdBy")]
        public Input<string>? CreatedBy { get; set; }

        /// <summary>
        /// The description of the SLO.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The service level indicator on which SLO is to be defined. more details on the difference
        /// b/w them can be found on
        /// the [slo help page](https://help.sumologic.com/Beta/SLO_Reliability_Management/Access_and_Create_SLOs)
        /// - window_based_evaluation - Evaluate SLI using successful/total windows.
        /// - request_based_evaluation - Evaluate SLI based on occurrence of successful
        /// events / total events over entire compliance period.
        /// </summary>
        [Input("indicator")]
        public Input<Inputs.SloIndicatorGetArgs>? Indicator { get; set; }

        [Input("isLocked")]
        public Input<bool>? IsLocked { get; set; }

        [Input("isMutable")]
        public Input<bool>? IsMutable { get; set; }

        [Input("isSystem")]
        public Input<bool>? IsSystem { get; set; }

        [Input("modifiedAt")]
        public Input<string>? ModifiedAt { get; set; }

        [Input("modifiedBy")]
        public Input<string>? ModifiedBy { get; set; }

        /// <summary>
        /// The name of the SLO. The name must be alphanumeric.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the SLO Folder that contains this SLO. Defaults to the root folder.
        /// </summary>
        [Input("parentId")]
        public Input<string>? ParentId { get; set; }

        [Input("postRequestMap")]
        private InputMap<string>? _postRequestMap;
        public InputMap<string> PostRequestMap
        {
            get => _postRequestMap ?? (_postRequestMap = new InputMap<string>());
            set => _postRequestMap = value;
        }

        /// <summary>
        /// Name of the service.
        /// </summary>
        [Input("service")]
        public Input<string>? Service { get; set; }

        /// <summary>
        /// The type of SLO. Valid values are `Latency`, `Error`, `Throughput`, `Availability`
        /// , `Other`. Defaults to `Latency`.
        /// </summary>
        [Input("signalType")]
        public Input<string>? SignalType { get; set; }

        [Input("version")]
        public Input<int>? Version { get; set; }

        public SloState()
        {
        }
        public static new SloState Empty => new SloState();
    }
}
