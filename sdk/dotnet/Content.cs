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
    /// using System.Collections.Generic;
    /// using System.Text.Json;
    /// using Pulumi;
    /// using SumoLogic = Pulumi.SumoLogic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var personalFolder = SumoLogic.GetPersonalFolder.Invoke();
    /// 
    ///     var test = new SumoLogic.Content("test", new()
    ///     {
    ///         ParentId = personalFolder.Apply(getPersonalFolderResult =&gt; getPersonalFolderResult.Id),
    ///         Config = JsonSerializer.Serialize(new Dictionary&lt;string, object?&gt;
    ///         {
    ///             ["type"] = "SavedSearchWithScheduleSyncDefinition",
    ///             ["name"] = "test-333",
    ///             ["search"] = new Dictionary&lt;string, object?&gt;
    ///             {
    ///                 ["queryText"] = "\"warn\"",
    ///                 ["defaultTimeRange"] = "-15m",
    ///                 ["byReceiptTime"] = false,
    ///                 ["viewName"] = "",
    ///                 ["viewStartTime"] = "1970-01-01T00:00:00Z",
    ///                 ["queryParameters"] = new[]
    ///                 {
    ///                 },
    ///                 ["parsingMode"] = "Manual",
    ///             },
    ///             ["searchSchedule"] = new Dictionary&lt;string, object?&gt;
    ///             {
    ///                 ["cronExpression"] = "0 0 * * * ? *",
    ///                 ["displayableTimeRange"] = "-10m",
    ///                 ["parseableTimeRange"] = new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     ["type"] = "BeginBoundedTimeRange",
    ///                     ["from"] = new Dictionary&lt;string, object?&gt;
    ///                     {
    ///                         ["type"] = "RelativeTimeRangeBoundary",
    ///                         ["relativeTime"] = "-50m",
    ///                     },
    ///                     ["to"] = null,
    ///                 },
    ///                 ["timeZone"] = "America/Los_Angeles",
    ///                 ["threshold"] = new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     ["thresholdType"] = "message",
    ///                     ["operator"] = "gt",
    ///                     ["count"] = 0,
    ///                 },
    ///                 ["notification"] = new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     ["taskType"] = "EmailSearchNotificationSyncDefinition",
    ///                     ["toList"] = new[]
    ///                     {
    ///                         "ops@acme.org",
    ///                     },
    ///                     ["subjectTemplate"] = "Search Results: {{Name}}",
    ///                     ["includeQuery"] = true,
    ///                     ["includeResultSet"] = true,
    ///                     ["includeHistogram"] = false,
    ///                     ["includeCsvAttachment"] = false,
    ///                 },
    ///                 ["scheduleType"] = "1Hour",
    ///                 ["muteErrorEmails"] = false,
    ///                 ["parameters"] = new[]
    ///                 {
    ///                 },
    ///             },
    ///             ["description"] = "Runs every hour with timerange of 15m and sends email notifications",
    ///         }),
    ///     });
    /// 
    /// });
    /// ```
    /// ## Attributes reference
    /// 
    /// The following attributes are exported:
    /// 
    /// - `id` - Unique identifier for the content item.
    /// 
    /// [1]: https://help.sumologic.com/APIs/Content-Management-API
    /// </summary>
    [SumoLogicResourceType("sumologic:index/content:Content")]
    public partial class Content : global::Pulumi.CustomResource
    {
        /// <summary>
        /// JSON block for the content to import. NOTE: Updating the name will create a new object and leave a untracked content item (delete the existing content item and create a new content item if you want to update the name).
        /// </summary>
        [Output("config")]
        public Output<string> Config { get; private set; } = null!;

        /// <summary>
        /// The identifier of the folder to import into. Identifiers from the Library in the Sumo user interface are provided in decimal format which is incompatible with this provider. The identifier needs to be in hexadecimal format.
        /// </summary>
        [Output("parentId")]
        public Output<string> ParentId { get; private set; } = null!;


        /// <summary>
        /// Create a Content resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Content(string name, ContentArgs args, CustomResourceOptions? options = null)
            : base("sumologic:index/content:Content", name, args ?? new ContentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Content(string name, Input<string> id, ContentState? state = null, CustomResourceOptions? options = null)
            : base("sumologic:index/content:Content", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Content resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Content Get(string name, Input<string> id, ContentState? state = null, CustomResourceOptions? options = null)
        {
            return new Content(name, id, state, options);
        }
    }

    public sealed class ContentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// JSON block for the content to import. NOTE: Updating the name will create a new object and leave a untracked content item (delete the existing content item and create a new content item if you want to update the name).
        /// </summary>
        [Input("config", required: true)]
        public Input<string> Config { get; set; } = null!;

        /// <summary>
        /// The identifier of the folder to import into. Identifiers from the Library in the Sumo user interface are provided in decimal format which is incompatible with this provider. The identifier needs to be in hexadecimal format.
        /// </summary>
        [Input("parentId", required: true)]
        public Input<string> ParentId { get; set; } = null!;

        public ContentArgs()
        {
        }
        public static new ContentArgs Empty => new ContentArgs();
    }

    public sealed class ContentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// JSON block for the content to import. NOTE: Updating the name will create a new object and leave a untracked content item (delete the existing content item and create a new content item if you want to update the name).
        /// </summary>
        [Input("config")]
        public Input<string>? Config { get; set; }

        /// <summary>
        /// The identifier of the folder to import into. Identifiers from the Library in the Sumo user interface are provided in decimal format which is incompatible with this provider. The identifier needs to be in hexadecimal format.
        /// </summary>
        [Input("parentId")]
        public Input<string>? ParentId { get; set; }

        public ContentState()
        {
        }
        public static new ContentState Empty => new ContentState();
    }
}
