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
import java.time.LocalDate;

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
 * OrderItemsDeliverRequestAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T13:07:32.599404+02:00[Europe/Prague]")
public class OrderItemsDeliverRequestAllOf {
  public static final String SERIALIZED_NAME_DELIVERY_DATE = "deliveryDate";
  @SerializedName(SERIALIZED_NAME_DELIVERY_DATE)
  private LocalDate deliveryDate;

  public OrderItemsDeliverRequestAllOf() {
  }

  public OrderItemsDeliverRequestAllOf deliveryDate(LocalDate deliveryDate) {
    
    this.deliveryDate = deliveryDate;
    return this;
  }

   /**
   * Delivery date
   * @return deliveryDate
  **/
  @javax.annotation.Nullable
  public LocalDate getDeliveryDate() {
    return deliveryDate;
  }


  public void setDeliveryDate(LocalDate deliveryDate) {
    this.deliveryDate = deliveryDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemsDeliverRequestAllOf orderItemsDeliverRequestAllOf = (OrderItemsDeliverRequestAllOf) o;
    return Objects.equals(this.deliveryDate, orderItemsDeliverRequestAllOf.deliveryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemsDeliverRequestAllOf {\n");
    sb.append("    deliveryDate: ").append(toIndentedString(deliveryDate)).append("\n");
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
    openapiFields.add("deliveryDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderItemsDeliverRequestAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OrderItemsDeliverRequestAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderItemsDeliverRequestAllOf is not found in the empty JSON string", OrderItemsDeliverRequestAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrderItemsDeliverRequestAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderItemsDeliverRequestAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderItemsDeliverRequestAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderItemsDeliverRequestAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderItemsDeliverRequestAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderItemsDeliverRequestAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderItemsDeliverRequestAllOf>() {
           @Override
           public void write(JsonWriter out, OrderItemsDeliverRequestAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderItemsDeliverRequestAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderItemsDeliverRequestAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderItemsDeliverRequestAllOf
  * @throws IOException if the JSON string is invalid with respect to OrderItemsDeliverRequestAllOf
  */
  public static OrderItemsDeliverRequestAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderItemsDeliverRequestAllOf.class);
  }

 /**
  * Convert an instance of OrderItemsDeliverRequestAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

