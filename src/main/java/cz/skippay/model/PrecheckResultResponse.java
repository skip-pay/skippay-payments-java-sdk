/**
 * Skip Pay API for partners
 * API documentation for Skip Pay partners.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: info@skippay.cz
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 */

package cz.skippay.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import cz.skippay.model.PrecheckResultResponseSerializer;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import cz.skippay.JSON;

/**
 * Precheck result.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-26T12:24:35.068083+02:00[Europe/Prague]")
public class PrecheckResultResponse {
  /**
   * Precheck result type for Funding type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    DEFERRED_PAYMENT("DEFERRED_PAYMENT"),
    
    PAY_IN_THREE("PAY_IN_THREE");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_RECOMMENDATION = "recommendation";
  @SerializedName(SERIALIZED_NAME_RECOMMENDATION)
  private Boolean recommendation;

  public static final String SERIALIZED_NAME_PROBABILITY_OF_APPROVAL = "probabilityOfApproval";
  @SerializedName(SERIALIZED_NAME_PROBABILITY_OF_APPROVAL)
  private BigDecimal probabilityOfApproval;

  public static final String SERIALIZED_NAME_COMPLETENESS = "completeness";
  @SerializedName(SERIALIZED_NAME_COMPLETENESS)
  private BigDecimal completeness;

  /**
   * Result code.
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    OK("OK"),
    
    UNKNOWN("UNKNOWN"),
    
    NOT_AVAILABLE("NOT_AVAILABLE"),
    
    ADDITIONAL_DATA_SECURITY("ADDITIONAL_DATA_SECURITY"),
    
    ADDITIONAL_DATA_LIMIT("ADDITIONAL_DATA_LIMIT"),
    
    INSUFFICIENT_LIMIT("INSUFFICIENT_LIMIT"),
    
    INSUFFICIENT_LIMIT_OPPORTUNITY("INSUFFICIENT_LIMIT_OPPORTUNITY"),
    
    DETAILS_NOT_MATCHING("DETAILS_NOT_MATCHING"),
    
    MANUAL_VERIFICATION("MANUAL_VERIFICATION");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CodeEnum fromValue(String value) {
      for (CodeEnum b : CodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private CodeEnum code;

  public static final String SERIALIZED_NAME_PRECHECK_RESULT_RESPONSE_SERIALIZER = "PrecheckResultResponseSerializer";
  @SerializedName(SERIALIZED_NAME_PRECHECK_RESULT_RESPONSE_SERIALIZER)
  private PrecheckResultResponseSerializer precheckResultResponseSerializer;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_ADDITIONAL_DATA = "additionalData";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_DATA)
  private List<String> additionalData;

  public PrecheckResultResponse() {
  }

  public PrecheckResultResponse type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Precheck result type for Funding type.
   * @return type
  **/
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public PrecheckResultResponse recommendation(Boolean recommendation) {
    
    this.recommendation = recommendation;
    return this;
  }

   /**
   * A recommendation of whether the order should be passed to the Skip Pay.  true &#x3D; Application is going to be likely approved. false &#x3D; Application is going to be likely rejected.
   * @return recommendation
  **/
  @javax.annotation.Nonnull
  public Boolean getRecommendation() {
    return recommendation;
  }


  public void setRecommendation(Boolean recommendation) {
    this.recommendation = recommendation;
  }


  public PrecheckResultResponse probabilityOfApproval(BigDecimal probabilityOfApproval) {
    
    this.probabilityOfApproval = probabilityOfApproval;
    return this;
  }

   /**
   * Probability of approval.  0 &#x3D; 0% to be approved 1 &#x3D; 100% to be approved  Partner can create custom logic not to follow the recommendation (be more strict or benevolent).
   * @return probabilityOfApproval
  **/
  @javax.annotation.Nonnull
  public BigDecimal getProbabilityOfApproval() {
    return probabilityOfApproval;
  }


  public void setProbabilityOfApproval(BigDecimal probabilityOfApproval) {
    this.probabilityOfApproval = probabilityOfApproval;
  }


  public PrecheckResultResponse completeness(BigDecimal completeness) {
    
    this.completeness = completeness;
    return this;
  }

   /**
   * Completness of the result. &lt;0, 1&gt; The lower is the value, the lower accuracy of the result.
   * @return completeness
  **/
  @javax.annotation.Nullable
  public BigDecimal getCompleteness() {
    return completeness;
  }


  public void setCompleteness(BigDecimal completeness) {
    this.completeness = completeness;
  }


  public PrecheckResultResponse code(CodeEnum code) {
    
    this.code = code;
    return this;
  }

   /**
   * Result code.
   * @return code
  **/
  @javax.annotation.Nullable
  public CodeEnum getCode() {
    return code;
  }


  public void setCode(CodeEnum code) {
    this.code = code;
  }


  public PrecheckResultResponse precheckResultResponseSerializer(PrecheckResultResponseSerializer precheckResultResponseSerializer) {
    
    this.precheckResultResponseSerializer = precheckResultResponseSerializer;
    return this;
  }

   /**
   * Get precheckResultResponseSerializer
   * @return precheckResultResponseSerializer
  **/
  @javax.annotation.Nonnull
  public PrecheckResultResponseSerializer getPrecheckResultResponseSerializer() {
    return precheckResultResponseSerializer;
  }


  public void setPrecheckResultResponseSerializer(PrecheckResultResponseSerializer precheckResultResponseSerializer) {
    this.precheckResultResponseSerializer = precheckResultResponseSerializer;
  }


  public PrecheckResultResponse message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Custom message for customer.  Examples: “V Skip Pay peněžence nemáte dostatečný limit.” “Uveďte do objednávky jméno a příjmení, které používáte ve službě Skip Pay.” etc.
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public PrecheckResultResponse additionalData(List<String> additionalData) {
    
    this.additionalData = additionalData;
    return this;
  }

  public PrecheckResultResponse addAdditionalDataItem(String additionalDataItem) {
    if (this.additionalData == null) {
      this.additionalData = new ArrayList<>();
    }
    this.additionalData.add(additionalDataItem);
    return this;
  }

   /**
   * List of additional data that customer has to send.  Possible values in array: &#x60;PERSONAL_ID&#x60;, &#x60;ID_CARD_NO&#x60;, &#x60;ID_CARD_EXPIRY_DATE&#x60;, &#x60;ID_CARD_SCAN&#x60;, &#x60;THIRD_PARTY_TELCO_CONSENT&#x60;.
   * @return additionalData
  **/
  @javax.annotation.Nullable
  public List<String> getAdditionalData() {
    return additionalData;
  }


  public void setAdditionalData(List<String> additionalData) {
    this.additionalData = additionalData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrecheckResultResponse precheckResultResponse = (PrecheckResultResponse) o;
    return Objects.equals(this.type, precheckResultResponse.type) &&
        Objects.equals(this.recommendation, precheckResultResponse.recommendation) &&
        Objects.equals(this.probabilityOfApproval, precheckResultResponse.probabilityOfApproval) &&
        Objects.equals(this.completeness, precheckResultResponse.completeness) &&
        Objects.equals(this.code, precheckResultResponse.code) &&
        Objects.equals(this.precheckResultResponseSerializer, precheckResultResponse.precheckResultResponseSerializer) &&
        Objects.equals(this.message, precheckResultResponse.message) &&
        Objects.equals(this.additionalData, precheckResultResponse.additionalData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, recommendation, probabilityOfApproval, completeness, code, precheckResultResponseSerializer, message, additionalData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrecheckResultResponse {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    recommendation: ").append(toIndentedString(recommendation)).append("\n");
    sb.append("    probabilityOfApproval: ").append(toIndentedString(probabilityOfApproval)).append("\n");
    sb.append("    completeness: ").append(toIndentedString(completeness)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    precheckResultResponseSerializer: ").append(toIndentedString(precheckResultResponseSerializer)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("type");
    openapiFields.add("recommendation");
    openapiFields.add("probabilityOfApproval");
    openapiFields.add("completeness");
    openapiFields.add("code");
    openapiFields.add("PrecheckResultResponseSerializer");
    openapiFields.add("message");
    openapiFields.add("additionalData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("recommendation");
    openapiRequiredFields.add("probabilityOfApproval");
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("PrecheckResultResponseSerializer");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PrecheckResultResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PrecheckResultResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PrecheckResultResponse is not found in the empty JSON string", PrecheckResultResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PrecheckResultResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PrecheckResultResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PrecheckResultResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("additionalData") != null && !jsonObj.get("additionalData").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `additionalData` to be an array in the JSON string but got `%s`", jsonObj.get("additionalData").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PrecheckResultResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PrecheckResultResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PrecheckResultResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PrecheckResultResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PrecheckResultResponse>() {
           @Override
           public void write(JsonWriter out, PrecheckResultResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PrecheckResultResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PrecheckResultResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PrecheckResultResponse
  * @throws IOException if the JSON string is invalid with respect to PrecheckResultResponse
  */
  public static PrecheckResultResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PrecheckResultResponse.class);
  }

 /**
  * Convert an instance of PrecheckResultResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

