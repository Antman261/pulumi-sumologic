// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class ContentPermissionPermissionGetArgs : Pulumi.ResourceArgs
    {
        [Input("permissionName", required: true)]
        public Input<string> PermissionName { get; set; } = null!;

        [Input("sourceId", required: true)]
        public Input<string> SourceId { get; set; } = null!;

        [Input("sourceType", required: true)]
        public Input<string> SourceType { get; set; } = null!;

        public ContentPermissionPermissionGetArgs()
        {
        }
    }
}