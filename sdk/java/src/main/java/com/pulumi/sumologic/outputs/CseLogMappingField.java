// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.sumologic.outputs.CseLogMappingFieldLookup;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CseLogMappingField {
    /**
     * @return List of alternate values.
     * 
     */
    private final @Nullable List<String> alternateValues;
    /**
     * @return Case insensitive flag.
     * 
     */
    private final @Nullable Boolean caseInsensitive;
    /**
     * @return Default value of the field.
     * 
     */
    private final @Nullable String defaultValue;
    /**
     * @return List of field join values.
     * 
     */
    private final @Nullable List<String> fieldJoins;
    /**
     * @return Format of the field. (JSON, Windows, Syslog, CEF, LEEF )
     * 
     */
    private final @Nullable String format;
    /**
     * @return List of format parameters.
     * 
     */
    private final @Nullable List<String> formatParameters;
    /**
     * @return Join delimiter.
     * 
     */
    private final @Nullable String joinDelimiter;
    /**
     * @return List of lookup key value pair for field. See lookup_schema for details.
     * 
     */
    private final @Nullable List<CseLogMappingFieldLookup> lookups;
    /**
     * @return Name of the field.
     * 
     */
    private final String name;
    /**
     * @return List of skipped values.
     * 
     */
    private final @Nullable List<String> skippedValues;
    /**
     * @return Split delimiter to be used. (some example: &#34;,&#34;, &#34;-&#34;, &#34;|&#34;)
     * 
     */
    private final @Nullable String splitDelimiter;
    /**
     * @return The index value to select (starting at zero)
     * 
     */
    private final @Nullable Integer splitIndex;
    /**
     * @return Time zone.
     * 
     */
    private final @Nullable String timeZone;
    /**
     * @return Lookup value.
     * 
     */
    private final @Nullable String value;
    /**
     * @return The value type.
     * 
     */
    private final @Nullable String valueType;

    @CustomType.Constructor
    private CseLogMappingField(
        @CustomType.Parameter("alternateValues") @Nullable List<String> alternateValues,
        @CustomType.Parameter("caseInsensitive") @Nullable Boolean caseInsensitive,
        @CustomType.Parameter("defaultValue") @Nullable String defaultValue,
        @CustomType.Parameter("fieldJoins") @Nullable List<String> fieldJoins,
        @CustomType.Parameter("format") @Nullable String format,
        @CustomType.Parameter("formatParameters") @Nullable List<String> formatParameters,
        @CustomType.Parameter("joinDelimiter") @Nullable String joinDelimiter,
        @CustomType.Parameter("lookups") @Nullable List<CseLogMappingFieldLookup> lookups,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("skippedValues") @Nullable List<String> skippedValues,
        @CustomType.Parameter("splitDelimiter") @Nullable String splitDelimiter,
        @CustomType.Parameter("splitIndex") @Nullable Integer splitIndex,
        @CustomType.Parameter("timeZone") @Nullable String timeZone,
        @CustomType.Parameter("value") @Nullable String value,
        @CustomType.Parameter("valueType") @Nullable String valueType) {
        this.alternateValues = alternateValues;
        this.caseInsensitive = caseInsensitive;
        this.defaultValue = defaultValue;
        this.fieldJoins = fieldJoins;
        this.format = format;
        this.formatParameters = formatParameters;
        this.joinDelimiter = joinDelimiter;
        this.lookups = lookups;
        this.name = name;
        this.skippedValues = skippedValues;
        this.splitDelimiter = splitDelimiter;
        this.splitIndex = splitIndex;
        this.timeZone = timeZone;
        this.value = value;
        this.valueType = valueType;
    }

    /**
     * @return List of alternate values.
     * 
     */
    public List<String> alternateValues() {
        return this.alternateValues == null ? List.of() : this.alternateValues;
    }
    /**
     * @return Case insensitive flag.
     * 
     */
    public Optional<Boolean> caseInsensitive() {
        return Optional.ofNullable(this.caseInsensitive);
    }
    /**
     * @return Default value of the field.
     * 
     */
    public Optional<String> defaultValue() {
        return Optional.ofNullable(this.defaultValue);
    }
    /**
     * @return List of field join values.
     * 
     */
    public List<String> fieldJoins() {
        return this.fieldJoins == null ? List.of() : this.fieldJoins;
    }
    /**
     * @return Format of the field. (JSON, Windows, Syslog, CEF, LEEF )
     * 
     */
    public Optional<String> format() {
        return Optional.ofNullable(this.format);
    }
    /**
     * @return List of format parameters.
     * 
     */
    public List<String> formatParameters() {
        return this.formatParameters == null ? List.of() : this.formatParameters;
    }
    /**
     * @return Join delimiter.
     * 
     */
    public Optional<String> joinDelimiter() {
        return Optional.ofNullable(this.joinDelimiter);
    }
    /**
     * @return List of lookup key value pair for field. See lookup_schema for details.
     * 
     */
    public List<CseLogMappingFieldLookup> lookups() {
        return this.lookups == null ? List.of() : this.lookups;
    }
    /**
     * @return Name of the field.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return List of skipped values.
     * 
     */
    public List<String> skippedValues() {
        return this.skippedValues == null ? List.of() : this.skippedValues;
    }
    /**
     * @return Split delimiter to be used. (some example: &#34;,&#34;, &#34;-&#34;, &#34;|&#34;)
     * 
     */
    public Optional<String> splitDelimiter() {
        return Optional.ofNullable(this.splitDelimiter);
    }
    /**
     * @return The index value to select (starting at zero)
     * 
     */
    public Optional<Integer> splitIndex() {
        return Optional.ofNullable(this.splitIndex);
    }
    /**
     * @return Time zone.
     * 
     */
    public Optional<String> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }
    /**
     * @return Lookup value.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }
    /**
     * @return The value type.
     * 
     */
    public Optional<String> valueType() {
        return Optional.ofNullable(this.valueType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CseLogMappingField defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> alternateValues;
        private @Nullable Boolean caseInsensitive;
        private @Nullable String defaultValue;
        private @Nullable List<String> fieldJoins;
        private @Nullable String format;
        private @Nullable List<String> formatParameters;
        private @Nullable String joinDelimiter;
        private @Nullable List<CseLogMappingFieldLookup> lookups;
        private String name;
        private @Nullable List<String> skippedValues;
        private @Nullable String splitDelimiter;
        private @Nullable Integer splitIndex;
        private @Nullable String timeZone;
        private @Nullable String value;
        private @Nullable String valueType;

        public Builder() {
    	      // Empty
        }

        public Builder(CseLogMappingField defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alternateValues = defaults.alternateValues;
    	      this.caseInsensitive = defaults.caseInsensitive;
    	      this.defaultValue = defaults.defaultValue;
    	      this.fieldJoins = defaults.fieldJoins;
    	      this.format = defaults.format;
    	      this.formatParameters = defaults.formatParameters;
    	      this.joinDelimiter = defaults.joinDelimiter;
    	      this.lookups = defaults.lookups;
    	      this.name = defaults.name;
    	      this.skippedValues = defaults.skippedValues;
    	      this.splitDelimiter = defaults.splitDelimiter;
    	      this.splitIndex = defaults.splitIndex;
    	      this.timeZone = defaults.timeZone;
    	      this.value = defaults.value;
    	      this.valueType = defaults.valueType;
        }

        public Builder alternateValues(@Nullable List<String> alternateValues) {
            this.alternateValues = alternateValues;
            return this;
        }
        public Builder alternateValues(String... alternateValues) {
            return alternateValues(List.of(alternateValues));
        }
        public Builder caseInsensitive(@Nullable Boolean caseInsensitive) {
            this.caseInsensitive = caseInsensitive;
            return this;
        }
        public Builder defaultValue(@Nullable String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public Builder fieldJoins(@Nullable List<String> fieldJoins) {
            this.fieldJoins = fieldJoins;
            return this;
        }
        public Builder fieldJoins(String... fieldJoins) {
            return fieldJoins(List.of(fieldJoins));
        }
        public Builder format(@Nullable String format) {
            this.format = format;
            return this;
        }
        public Builder formatParameters(@Nullable List<String> formatParameters) {
            this.formatParameters = formatParameters;
            return this;
        }
        public Builder formatParameters(String... formatParameters) {
            return formatParameters(List.of(formatParameters));
        }
        public Builder joinDelimiter(@Nullable String joinDelimiter) {
            this.joinDelimiter = joinDelimiter;
            return this;
        }
        public Builder lookups(@Nullable List<CseLogMappingFieldLookup> lookups) {
            this.lookups = lookups;
            return this;
        }
        public Builder lookups(CseLogMappingFieldLookup... lookups) {
            return lookups(List.of(lookups));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder skippedValues(@Nullable List<String> skippedValues) {
            this.skippedValues = skippedValues;
            return this;
        }
        public Builder skippedValues(String... skippedValues) {
            return skippedValues(List.of(skippedValues));
        }
        public Builder splitDelimiter(@Nullable String splitDelimiter) {
            this.splitDelimiter = splitDelimiter;
            return this;
        }
        public Builder splitIndex(@Nullable Integer splitIndex) {
            this.splitIndex = splitIndex;
            return this;
        }
        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public Builder valueType(@Nullable String valueType) {
            this.valueType = valueType;
            return this;
        }        public CseLogMappingField build() {
            return new CseLogMappingField(alternateValues, caseInsensitive, defaultValue, fieldJoins, format, formatParameters, joinDelimiter, lookups, name, skippedValues, splitDelimiter, splitIndex, timeZone, value, valueType);
        }
    }
}