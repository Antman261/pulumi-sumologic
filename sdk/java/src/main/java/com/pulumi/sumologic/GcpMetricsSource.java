// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.sumologic.GcpMetricsSourceArgs;
import com.pulumi.sumologic.Utilities;
import com.pulumi.sumologic.inputs.GcpMetricsSourceState;
import com.pulumi.sumologic.outputs.GcpMetricsSourceAuthentication;
import com.pulumi.sumologic.outputs.GcpMetricsSourceDefaultDateFormat;
import com.pulumi.sumologic.outputs.GcpMetricsSourceFilter;
import com.pulumi.sumologic.outputs.GcpMetricsSourcePath;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a `Sumologic GCP Metrics Source`
 * 
 * __IMPORTANT:__ The Service Account parameters (including private key) are stored in plain-text in the state. This is a potential security issue.
 * 
 * ## Import
 * 
 * GCP Metrics sources can be imported using the collector and source IDs (`collector/source`), e.g.hcl
 * 
 * ```sh
 *  $ pulumi import sumologic:index/gcpMetricsSource:GcpMetricsSource test 123/456
 * ```
 * 
 *  GCP Metrics sources can be imported using the collector name and source name (`collectorName/sourceName`), e.g.hcl
 * 
 * ```sh
 *  $ pulumi import sumologic:index/gcpMetricsSource:GcpMetricsSource test my-test-collector/my-test-source
 * ```
 * 
 *  [1]https://help.sumologic.com/Send_Data/Sources/03Use_JSON_to_Configure_Sources/JSON_Parameters_for_Hosted_Sources
 * 
 */
@ResourceType(type="sumologic:index/gcpMetricsSource:GcpMetricsSource")
public class GcpMetricsSource extends com.pulumi.resources.CustomResource {
    /**
     * Authentication details for connecting to the  GCP Monitoring using service_account credentials.
     * 
     */
    @Export(name="authentication", type=GcpMetricsSourceAuthentication.class, parameters={})
    private Output<GcpMetricsSourceAuthentication> authentication;

    /**
     * @return Authentication details for connecting to the  GCP Monitoring using service_account credentials.
     * 
     */
    public Output<GcpMetricsSourceAuthentication> authentication() {
        return this.authentication;
    }
    @Export(name="automaticDateParsing", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> automaticDateParsing;

    public Output<Optional<Boolean>> automaticDateParsing() {
        return Codegen.optional(this.automaticDateParsing);
    }
    @Export(name="category", type=String.class, parameters={})
    private Output</* @Nullable */ String> category;

    public Output<Optional<String>> category() {
        return Codegen.optional(this.category);
    }
    @Export(name="collectorId", type=Integer.class, parameters={})
    private Output<Integer> collectorId;

    public Output<Integer> collectorId() {
        return this.collectorId;
    }
    /**
     * The content-type of the collected data. Details can be found in the [Sumologic documentation for hosted sources](https://help.sumologic.com/Send_Data/Sources/03Use_JSON_to_Configure_Sources/JSON_Parameters_for_Hosted_Sources).
     * 
     */
    @Export(name="contentType", type=String.class, parameters={})
    private Output<String> contentType;

    /**
     * @return The content-type of the collected data. Details can be found in the [Sumologic documentation for hosted sources](https://help.sumologic.com/Send_Data/Sources/03Use_JSON_to_Configure_Sources/JSON_Parameters_for_Hosted_Sources).
     * 
     */
    public Output<String> contentType() {
        return this.contentType;
    }
    @Export(name="cutoffRelativeTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> cutoffRelativeTime;

    public Output<Optional<String>> cutoffRelativeTime() {
        return Codegen.optional(this.cutoffRelativeTime);
    }
    @Export(name="cutoffTimestamp", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> cutoffTimestamp;

    public Output<Optional<Integer>> cutoffTimestamp() {
        return Codegen.optional(this.cutoffTimestamp);
    }
    @Export(name="defaultDateFormats", type=List.class, parameters={GcpMetricsSourceDefaultDateFormat.class})
    private Output</* @Nullable */ List<GcpMetricsSourceDefaultDateFormat>> defaultDateFormats;

    public Output<Optional<List<GcpMetricsSourceDefaultDateFormat>>> defaultDateFormats() {
        return Codegen.optional(this.defaultDateFormats);
    }
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    @Export(name="fields", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> fields;

    public Output<Optional<Map<String,String>>> fields() {
        return Codegen.optional(this.fields);
    }
    @Export(name="filters", type=List.class, parameters={GcpMetricsSourceFilter.class})
    private Output</* @Nullable */ List<GcpMetricsSourceFilter>> filters;

    public Output<Optional<List<GcpMetricsSourceFilter>>> filters() {
        return Codegen.optional(this.filters);
    }
    @Export(name="forceTimezone", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceTimezone;

    public Output<Optional<Boolean>> forceTimezone() {
        return Codegen.optional(this.forceTimezone);
    }
    @Export(name="hostName", type=String.class, parameters={})
    private Output</* @Nullable */ String> hostName;

    public Output<Optional<String>> hostName() {
        return Codegen.optional(this.hostName);
    }
    @Export(name="manualPrefixRegexp", type=String.class, parameters={})
    private Output</* @Nullable */ String> manualPrefixRegexp;

    public Output<Optional<String>> manualPrefixRegexp() {
        return Codegen.optional(this.manualPrefixRegexp);
    }
    @Export(name="multilineProcessingEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> multilineProcessingEnabled;

    public Output<Optional<Boolean>> multilineProcessingEnabled() {
        return Codegen.optional(this.multilineProcessingEnabled);
    }
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    /**
     * Details about what data to ingest
     * 
     */
    @Export(name="path", type=GcpMetricsSourcePath.class, parameters={})
    private Output<GcpMetricsSourcePath> path;

    /**
     * @return Details about what data to ingest
     * 
     */
    public Output<GcpMetricsSourcePath> path() {
        return this.path;
    }
    /**
     * When set to true, the scanner is paused. To disable, set to false.
     * 
     */
    @Export(name="paused", type=Boolean.class, parameters={})
    private Output<Boolean> paused;

    /**
     * @return When set to true, the scanner is paused. To disable, set to false.
     * 
     */
    public Output<Boolean> paused() {
        return this.paused;
    }
    /**
     * Time interval in milliseconds of scans for new data. The default is 300000 and the minimum value is 1000 milliseconds.
     * 
     */
    @Export(name="scanInterval", type=Integer.class, parameters={})
    private Output<Integer> scanInterval;

    /**
     * @return Time interval in milliseconds of scans for new data. The default is 300000 and the minimum value is 1000 milliseconds.
     * 
     */
    public Output<Integer> scanInterval() {
        return this.scanInterval;
    }
    @Export(name="timezone", type=String.class, parameters={})
    private Output</* @Nullable */ String> timezone;

    public Output<Optional<String>> timezone() {
        return Codegen.optional(this.timezone);
    }
    @Export(name="url", type=String.class, parameters={})
    private Output<String> url;

    public Output<String> url() {
        return this.url;
    }
    @Export(name="useAutolineMatching", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> useAutolineMatching;

    public Output<Optional<Boolean>> useAutolineMatching() {
        return Codegen.optional(this.useAutolineMatching);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GcpMetricsSource(String name) {
        this(name, GcpMetricsSourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GcpMetricsSource(String name, GcpMetricsSourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GcpMetricsSource(String name, GcpMetricsSourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sumologic:index/gcpMetricsSource:GcpMetricsSource", name, args == null ? GcpMetricsSourceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GcpMetricsSource(String name, Output<String> id, @Nullable GcpMetricsSourceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sumologic:index/gcpMetricsSource:GcpMetricsSource", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static GcpMetricsSource get(String name, Output<String> id, @Nullable GcpMetricsSourceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GcpMetricsSource(name, id, state, options);
    }
}
