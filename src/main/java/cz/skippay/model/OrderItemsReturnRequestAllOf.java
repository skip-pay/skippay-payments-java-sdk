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
import cz.skippay.model.DocumentRequest;
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
 * OrderItemsReturnRequestAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-26T12:24:35.068083+02:00[Europe/Prague]")
public class OrderItemsReturnRequestAllOf {
  public static final String SERIALIZED_NAME_DOCUMENT = "document";
  @SerializedName(SERIALIZED_NAME_DOCUMENT)
  private DocumentRequest document;

  public static final String SERIALIZED_NAME_VARIABLE_SYMBOL = "variableSymbol";
  @SerializedName(SERIALIZED_NAME_VARIABLE_SYMBOL)
  private String variableSymbol;

  public OrderItemsReturnRequestAllOf() {
  }

  public OrderItemsReturnRequestAllOf document(DocumentRequest document) {
    
    this.document = document;
    return this;
  }

   /**
   * Get document
   * @return document
  **/
  @javax.annotation.Nullable
  public DocumentRequest getDocument() {
    return document;
  }


  public void setDocument(DocumentRequest document) {
    this.document = document;
  }


  public OrderItemsReturnRequestAllOf variableSymbol(String variableSymbol) {
    
    this.variableSymbol = variableSymbol;
    return this;
  }

   /**
   * Variable symbol of the new document (credit note, ...). This symbols is used by Skip Pay to pair payment from e-shop.
   * @return variableSymbol
  **/
  @javax.annotation.Nullable
  public String getVariableSymbol() {
    return variableSymbol;
  }


  public void setVariableSymbol(String variableSymbol) {
    this.variableSymbol = variableSymbol;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemsReturnRequestAllOf orderItemsReturnRequestAllOf = (OrderItemsReturnRequestAllOf) o;
    return Objects.equals(this.document, orderItemsReturnRequestAllOf.document) &&
        Objects.equals(this.variableSymbol, orderItemsReturnRequestAllOf.variableSymbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(document, variableSymbol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemsReturnRequestAllOf {\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    variableSymbol: ").append(toIndentedString(variableSymbol)).append("\n");
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
    openapiFields.add("document");
    openapiFields.add("variableSymbol");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderItemsReturnRequestAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OrderItemsReturnRequestAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderItemsReturnRequestAllOf is not found in the empty JSON string", OrderItemsReturnRequestAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrderItemsReturnRequestAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderItemsReturnRequestAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `document`
      if (jsonObj.get("document") != null && !jsonObj.get("document").isJsonNull()) {
        DocumentRequest.validateJsonObject(jsonObj.getAsJsonObject("document"));
      }
      if ((jsonObj.get("variableSymbol") != null && !jsonObj.get("variableSymbol").isJsonNull()) && !jsonObj.get("variableSymbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variableSymbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variableSymbol").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderItemsReturnRequestAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderItemsReturnRequestAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderItemsReturnRequestAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderItemsReturnRequestAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderItemsReturnRequestAllOf>() {
           @Override
           public void write(JsonWriter out, OrderItemsReturnRequestAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderItemsReturnRequestAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderItemsReturnRequestAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderItemsReturnRequestAllOf
  * @throws IOException if the JSON string is invalid with respect to OrderItemsReturnRequestAllOf
  */
  public static OrderItemsReturnRequestAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderItemsReturnRequestAllOf.class);
  }

 /**
  * Convert an instance of OrderItemsReturnRequestAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

