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
import cz.skippay.model.FileRequest;
import cz.skippay.model.VatAmount;
import java.io.IOException;
import java.math.BigDecimal;

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
 * OrderItemRequestAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-26T12:24:35.068083+02:00[Europe/Prague]")
public class OrderItemRequestAllOf {
  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private FileRequest image;

  public static final String SERIALIZED_NAME_UNIT_PRICE = "unitPrice";
  @SerializedName(SERIALIZED_NAME_UNIT_PRICE)
  private Amount unitPrice;

  public static final String SERIALIZED_NAME_UNIT_VAT = "unitVat";
  @SerializedName(SERIALIZED_NAME_UNIT_VAT)
  private VatAmount unitVat;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private BigDecimal quantity;

  public OrderItemRequestAllOf() {
  }

  public OrderItemRequestAllOf image(FileRequest image) {
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  public FileRequest getImage() {
    return image;
  }


  public void setImage(FileRequest image) {
    this.image = image;
  }


  public OrderItemRequestAllOf unitPrice(Amount unitPrice) {
    
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Get unitPrice
   * @return unitPrice
  **/
  @javax.annotation.Nullable
  public Amount getUnitPrice() {
    return unitPrice;
  }


  public void setUnitPrice(Amount unitPrice) {
    this.unitPrice = unitPrice;
  }


  public OrderItemRequestAllOf unitVat(VatAmount unitVat) {
    
    this.unitVat = unitVat;
    return this;
  }

   /**
   * Get unitVat
   * @return unitVat
  **/
  @javax.annotation.Nullable
  public VatAmount getUnitVat() {
    return unitVat;
  }


  public void setUnitVat(VatAmount unitVat) {
    this.unitVat = unitVat;
  }


  public OrderItemRequestAllOf quantity(BigDecimal quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * (positive float/decimal up to 3 decimal places) Item quantity. If empty, considered as 1.
   * minimum: 1
   * @return quantity
  **/
  @javax.annotation.Nullable
  public BigDecimal getQuantity() {
    return quantity;
  }


  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemRequestAllOf orderItemRequestAllOf = (OrderItemRequestAllOf) o;
    return Objects.equals(this.image, orderItemRequestAllOf.image) &&
        Objects.equals(this.unitPrice, orderItemRequestAllOf.unitPrice) &&
        Objects.equals(this.unitVat, orderItemRequestAllOf.unitVat) &&
        Objects.equals(this.quantity, orderItemRequestAllOf.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image, unitPrice, unitVat, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemRequestAllOf {\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    unitVat: ").append(toIndentedString(unitVat)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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
    openapiFields.add("image");
    openapiFields.add("unitPrice");
    openapiFields.add("unitVat");
    openapiFields.add("quantity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderItemRequestAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OrderItemRequestAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderItemRequestAllOf is not found in the empty JSON string", OrderItemRequestAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrderItemRequestAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderItemRequestAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `image`
      if (jsonObj.get("image") != null && !jsonObj.get("image").isJsonNull()) {
        FileRequest.validateJsonObject(jsonObj.getAsJsonObject("image"));
      }
      // validate the optional field `unitPrice`
      if (jsonObj.get("unitPrice") != null && !jsonObj.get("unitPrice").isJsonNull()) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("unitPrice"));
      }
      // validate the optional field `unitVat`
      if (jsonObj.get("unitVat") != null && !jsonObj.get("unitVat").isJsonNull()) {
        VatAmount.validateJsonObject(jsonObj.getAsJsonObject("unitVat"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderItemRequestAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderItemRequestAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderItemRequestAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderItemRequestAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderItemRequestAllOf>() {
           @Override
           public void write(JsonWriter out, OrderItemRequestAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderItemRequestAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderItemRequestAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderItemRequestAllOf
  * @throws IOException if the JSON string is invalid with respect to OrderItemRequestAllOf
  */
  public static OrderItemRequestAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderItemRequestAllOf.class);
  }

 /**
  * Convert an instance of OrderItemRequestAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

