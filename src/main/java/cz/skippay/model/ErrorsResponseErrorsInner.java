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
import java.io.IOException;

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
 * ErrorsResponseErrorsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T13:07:32.599404+02:00[Europe/Prague]")
public class ErrorsResponseErrorsInner {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  /**
   * Gets or Sets severity
   */
  @JsonAdapter(SeverityEnum.Adapter.class)
  public enum SeverityEnum {
    ERROR("ERROR"),
    
    WARN("WARN"),
    
    INFO("INFO");

    private String value;

    SeverityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SeverityEnum fromValue(String value) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SeverityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SeverityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SeverityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SeverityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private SeverityEnum severity;

  public static final String SERIALIZED_NAME_ATTRIBUTE = "attribute";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE)
  private String attribute;

  public static final String SERIALIZED_NAME_TICKET_ID = "ticketId";
  @SerializedName(SERIALIZED_NAME_TICKET_ID)
  private String ticketId;

  public ErrorsResponseErrorsInner() {
  }

  public ErrorsResponseErrorsInner code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Unique internal error code
   * @return code
  **/
  @javax.annotation.Nonnull
  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public ErrorsResponseErrorsInner message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Human readable error description (non-localized)
   * @return message
  **/
  @javax.annotation.Nonnull
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public ErrorsResponseErrorsInner severity(SeverityEnum severity) {
    
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @javax.annotation.Nonnull
  public SeverityEnum getSeverity() {
    return severity;
  }


  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }


  public ErrorsResponseErrorsInner attribute(String attribute) {
    
    this.attribute = attribute;
    return this;
  }

   /**
   * JSON path of request attribute that caused the error (if applicable)
   * @return attribute
  **/
  @javax.annotation.Nullable
  public String getAttribute() {
    return attribute;
  }


  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }


  public ErrorsResponseErrorsInner ticketId(String ticketId) {
    
    this.ticketId = ticketId;
    return this;
  }

   /**
   * Internal ticket ID, used for error backtracking
   * @return ticketId
  **/
  @javax.annotation.Nullable
  public String getTicketId() {
    return ticketId;
  }


  public void setTicketId(String ticketId) {
    this.ticketId = ticketId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorsResponseErrorsInner errorsResponseErrorsInner = (ErrorsResponseErrorsInner) o;
    return Objects.equals(this.code, errorsResponseErrorsInner.code) &&
        Objects.equals(this.message, errorsResponseErrorsInner.message) &&
        Objects.equals(this.severity, errorsResponseErrorsInner.severity) &&
        Objects.equals(this.attribute, errorsResponseErrorsInner.attribute) &&
        Objects.equals(this.ticketId, errorsResponseErrorsInner.ticketId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, severity, attribute, ticketId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsResponseErrorsInner {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    ticketId: ").append(toIndentedString(ticketId)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("message");
    openapiFields.add("severity");
    openapiFields.add("attribute");
    openapiFields.add("ticketId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("message");
    openapiRequiredFields.add("severity");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ErrorsResponseErrorsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ErrorsResponseErrorsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ErrorsResponseErrorsInner is not found in the empty JSON string", ErrorsResponseErrorsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ErrorsResponseErrorsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ErrorsResponseErrorsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ErrorsResponseErrorsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (!jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if (!jsonObj.get("severity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `severity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("severity").toString()));
      }
      if ((jsonObj.get("attribute") != null && !jsonObj.get("attribute").isJsonNull()) && !jsonObj.get("attribute").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attribute` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attribute").toString()));
      }
      if ((jsonObj.get("ticketId") != null && !jsonObj.get("ticketId").isJsonNull()) && !jsonObj.get("ticketId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ticketId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ticketId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ErrorsResponseErrorsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ErrorsResponseErrorsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ErrorsResponseErrorsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ErrorsResponseErrorsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ErrorsResponseErrorsInner>() {
           @Override
           public void write(JsonWriter out, ErrorsResponseErrorsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ErrorsResponseErrorsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ErrorsResponseErrorsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ErrorsResponseErrorsInner
  * @throws IOException if the JSON string is invalid with respect to ErrorsResponseErrorsInner
  */
  public static ErrorsResponseErrorsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ErrorsResponseErrorsInner.class);
  }

 /**
  * Convert an instance of ErrorsResponseErrorsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

