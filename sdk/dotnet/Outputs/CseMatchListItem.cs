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
    public sealed class CseMatchListItem
    {
        /// <summary>
        /// Match list item description.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Match list item expiration. (Format: YYYY-MM-DDTHH:mm:ss)
        /// </summary>
        public readonly string? Expiration;
        /// <summary>
        /// The internal ID of the match list.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// Match list item value.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private CseMatchListItem(
            string description,

            string? expiration,

            string? id,

            string value)
        {
            Description = description;
            Expiration = expiration;
            Id = id;
            Value = value;
        }
    }
}