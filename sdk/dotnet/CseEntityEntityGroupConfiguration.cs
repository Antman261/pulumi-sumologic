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
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using SumoLogic = Pulumi.SumoLogic;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var entityEntityGroupConfiguration = new SumoLogic.CseEntityEntityGroupConfiguration("entityEntityGroupConfiguration", new SumoLogic.CseEntityEntityGroupConfigurationArgs
    ///         {
    ///             Criticality = "HIGH",
    ///             Description = "Entity Group description",
    ///             EntityNamespace = "namespace",
    ///             EntityType = "_hostname",
    ///             Suffix = "red.co",
    ///             Suppressed = true,
    ///             Tags = 
    ///             {
    ///                 "tag",
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Entity Entity Group Configuration can be imported using the field id, e.g.hcl
    /// 
    /// ```sh
    ///  $ pulumi import sumologic:index/cseEntityEntityGroupConfiguration:CseEntityEntityGroupConfiguration entity_entity_group_configuration id
    /// ```
    /// </summary>
    [SumoLogicResourceType("sumologic:index/cseEntityEntityGroupConfiguration:CseEntityEntityGroupConfiguration")]
    public partial class CseEntityEntityGroupConfiguration : Pulumi.CustomResource
    {
        /// <summary>
        /// The entity group configuration criticality Examples: "HIGH", "CRITICALITY".
        /// </summary>
        [Output("criticality")]
        public Output<string?> Criticality { get; private set; } = null!;

        /// <summary>
        /// The entity group configuration description.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The entity namespace.
        /// </summary>
        [Output("entityNamespace")]
        public Output<string?> EntityNamespace { get; private set; } = null!;

        /// <summary>
        /// The entity type Examples: "_ip", "_mac", "_username", "_hostname".
        /// </summary>
        [Output("entityType")]
        public Output<string?> EntityType { get; private set; } = null!;

        /// <summary>
        /// The entity group configuration name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The entity group configuration network block value Example: "192.168.0.0/16".
        /// </summary>
        [Output("networkBlock")]
        public Output<string?> NetworkBlock { get; private set; } = null!;

        /// <summary>
        /// The entity group configuration prefix value.
        /// </summary>
        [Output("prefix")]
        public Output<string?> Prefix { get; private set; } = null!;

        /// <summary>
        /// The entity group configuration suffix value.
        /// </summary>
        [Output("suffix")]
        public Output<string?> Suffix { get; private set; } = null!;

        [Output("suppressed")]
        public Output<bool?> Suppressed { get; private set; } = null!;

        /// <summary>
        /// The entity group configuration tags list.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a CseEntityEntityGroupConfiguration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CseEntityEntityGroupConfiguration(string name, CseEntityEntityGroupConfigurationArgs? args = null, CustomResourceOptions? options = null)
            : base("sumologic:index/cseEntityEntityGroupConfiguration:CseEntityEntityGroupConfiguration", name, args ?? new CseEntityEntityGroupConfigurationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CseEntityEntityGroupConfiguration(string name, Input<string> id, CseEntityEntityGroupConfigurationState? state = null, CustomResourceOptions? options = null)
            : base("sumologic:index/cseEntityEntityGroupConfiguration:CseEntityEntityGroupConfiguration", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CseEntityEntityGroupConfiguration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CseEntityEntityGroupConfiguration Get(string name, Input<string> id, CseEntityEntityGroupConfigurationState? state = null, CustomResourceOptions? options = null)
        {
            return new CseEntityEntityGroupConfiguration(name, id, state, options);
        }
    }

    public sealed class CseEntityEntityGroupConfigurationArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The entity group configuration criticality Examples: "HIGH", "CRITICALITY".
        /// </summary>
        [Input("criticality")]
        public Input<string>? Criticality { get; set; }

        /// <summary>
        /// The entity group configuration description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The entity namespace.
        /// </summary>
        [Input("entityNamespace")]
        public Input<string>? EntityNamespace { get; set; }

        /// <summary>
        /// The entity type Examples: "_ip", "_mac", "_username", "_hostname".
        /// </summary>
        [Input("entityType")]
        public Input<string>? EntityType { get; set; }

        /// <summary>
        /// The entity group configuration name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The entity group configuration network block value Example: "192.168.0.0/16".
        /// </summary>
        [Input("networkBlock")]
        public Input<string>? NetworkBlock { get; set; }

        /// <summary>
        /// The entity group configuration prefix value.
        /// </summary>
        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

        /// <summary>
        /// The entity group configuration suffix value.
        /// </summary>
        [Input("suffix")]
        public Input<string>? Suffix { get; set; }

        [Input("suppressed")]
        public Input<bool>? Suppressed { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// The entity group configuration tags list.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public CseEntityEntityGroupConfigurationArgs()
        {
        }
    }

    public sealed class CseEntityEntityGroupConfigurationState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The entity group configuration criticality Examples: "HIGH", "CRITICALITY".
        /// </summary>
        [Input("criticality")]
        public Input<string>? Criticality { get; set; }

        /// <summary>
        /// The entity group configuration description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The entity namespace.
        /// </summary>
        [Input("entityNamespace")]
        public Input<string>? EntityNamespace { get; set; }

        /// <summary>
        /// The entity type Examples: "_ip", "_mac", "_username", "_hostname".
        /// </summary>
        [Input("entityType")]
        public Input<string>? EntityType { get; set; }

        /// <summary>
        /// The entity group configuration name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The entity group configuration network block value Example: "192.168.0.0/16".
        /// </summary>
        [Input("networkBlock")]
        public Input<string>? NetworkBlock { get; set; }

        /// <summary>
        /// The entity group configuration prefix value.
        /// </summary>
        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

        /// <summary>
        /// The entity group configuration suffix value.
        /// </summary>
        [Input("suffix")]
        public Input<string>? Suffix { get; set; }

        [Input("suppressed")]
        public Input<bool>? Suppressed { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// The entity group configuration tags list.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public CseEntityEntityGroupConfigurationState()
        {
        }
    }
}