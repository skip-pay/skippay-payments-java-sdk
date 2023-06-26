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
import cz.skippay.model.Amount;
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
 * Customer&#39;s limits
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-26T12:24:35.068083+02:00[Europe/Prague]")
public class Limits {
  public static final String SERIALIZED_NAME_AVAILABLE_LIMIT = "availableLimit";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_LIMIT)
  private Amount availableLimit;

  public static final String SERIALIZED_NAME_TOTAL_LIMIT = "totalLimit";
  @SerializedName(SERIALIZED_NAME_TOTAL_LIMIT)
  private Amount totalLimit;

  public Limits() {
  }

  public Limits availableLimit(Amount availableLimit) {
    
    this.availableLimit = availableLimit;
    return this;
  }

   /**
   * Get availableLimit
   * @return availableLimit
  **/
  @javax.annotation.Nonnull
  public Amount getAvailableLimit() {
    return availableLimit;
  }


  public void setAvailableLimit(Amount availableLimit) {
    this.availableLimit = availableLimit;
  }


  public Limits totalLimit(Amount totalLimit) {
    
    this.totalLimit = totalLimit;
    return this;
  }

   /**
   * Get totalLimit
   * @return totalLimit
  **/
  @javax.annotation.Nonnull
  public Amount getTotalLimit() {
    return totalLimit;
  }


  public void setTotalLimit(Amount totalLimit) {
    this.totalLimit = totalLimit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Limits limits = (Limits) o;
    return Objects.equals(this.availableLimit, limits.availableLimit) &&
        Objects.equals(this.totalLimit, limits.totalLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableLimit, totalLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Limits {\n");
    sb.append("    availableLimit: ").append(toIndentedString(availableLimit)).append("\n");
    sb.append("    totalLimit: ").append(toIndentedString(totalLimit)).append("\n");
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
    openapiFields.add("availableLimit");
    openapiFields.add("totalLimit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("availableLimit");
    openapiRequiredFields.add("totalLimit");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Limits
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Limits.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Limits is not found in the empty JSON string", Limits.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Limits.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Limits` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Limits.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `availableLimit`
      Amount.validateJsonObject(jsonObj.getAsJsonObject("availableLimit"));
      // validate the required field `totalLimit`
      Amount.validateJsonObject(jsonObj.getAsJsonObject("totalLimit"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Limits.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Limits' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Limits> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Limits.class));

       return (TypeAdapter<T>) new TypeAdapter<Limits>() {
           @Override
           public void write(JsonWriter out, Limits value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Limits read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Limits given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Limits
  * @throws IOException if the JSON string is invalid with respect to Limits
  */
  public static Limits fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Limits.class);
  }

 /**
  * Convert an instance of Limits to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

