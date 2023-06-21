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
import cz.skippay.model.FileResponse;
import cz.skippay.model.OrderDeliveryState;
import cz.skippay.model.VatAmount;
import java.io.IOException;
import java.math.BigDecimal;
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
 * OrderItemResponseAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T13:07:32.599404+02:00[Europe/Prague]")
public class OrderItemResponseAllOf {
  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private OrderDeliveryState state;

  public static final String SERIALIZED_NAME_SENT_DATE = "sentDate";
  @SerializedName(SERIALIZED_NAME_SENT_DATE)
  private LocalDate sentDate;

  public static final String SERIALIZED_NAME_DELIVERY_DATE = "deliveryDate";
  @SerializedName(SERIALIZED_NAME_DELIVERY_DATE)
  private LocalDate deliveryDate;

  public static final String SERIALIZED_NAME_DELIVERY_TRACKING_NUMBER = "deliveryTrackingNumber";
  @SerializedName(SERIALIZED_NAME_DELIVERY_TRACKING_NUMBER)
  private String deliveryTrackingNumber;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private FileResponse image;

  public static final String SERIALIZED_NAME_UNIT_PRICE = "unitPrice";
  @SerializedName(SERIALIZED_NAME_UNIT_PRICE)
  private Amount unitPrice;

  public static final String SERIALIZED_NAME_UNIT_VAT = "unitVat";
  @SerializedName(SERIALIZED_NAME_UNIT_VAT)
  private VatAmount unitVat;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private BigDecimal quantity;

  public OrderItemResponseAllOf() {
  }

  public OrderItemResponseAllOf state(OrderDeliveryState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull
  public OrderDeliveryState getState() {
    return state;
  }


  public void setState(OrderDeliveryState state) {
    this.state = state;
  }


  public OrderItemResponseAllOf sentDate(LocalDate sentDate) {
    
    this.sentDate = sentDate;
    return this;
  }

   /**
   * Date when item was sent. Only when the whole order was NOT sent at once.
   * @return sentDate
  **/
  @javax.annotation.Nullable
  public LocalDate getSentDate() {
    return sentDate;
  }


  public void setSentDate(LocalDate sentDate) {
    this.sentDate = sentDate;
  }


  public OrderItemResponseAllOf deliveryDate(LocalDate deliveryDate) {
    
    this.deliveryDate = deliveryDate;
    return this;
  }

   /**
   * Date when item was delivered. Only when the whole order was NOT sent at once.
   * @return deliveryDate
  **/
  @javax.annotation.Nullable
  public LocalDate getDeliveryDate() {
    return deliveryDate;
  }


  public void setDeliveryDate(LocalDate deliveryDate) {
    this.deliveryDate = deliveryDate;
  }


  public OrderItemResponseAllOf deliveryTrackingNumber(String deliveryTrackingNumber) {
    
    this.deliveryTrackingNumber = deliveryTrackingNumber;
    return this;
  }

   /**
   * Tracking number for the item. Only when the whole order was NOT sent at once.
   * @return deliveryTrackingNumber
  **/
  @javax.annotation.Nullable
  public String getDeliveryTrackingNumber() {
    return deliveryTrackingNumber;
  }


  public void setDeliveryTrackingNumber(String deliveryTrackingNumber) {
    this.deliveryTrackingNumber = deliveryTrackingNumber;
  }


  public OrderItemResponseAllOf image(FileResponse image) {
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  public FileResponse getImage() {
    return image;
  }


  public void setImage(FileResponse image) {
    this.image = image;
  }


  public OrderItemResponseAllOf unitPrice(Amount unitPrice) {
    
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Get unitPrice
   * @return unitPrice
  **/
  @javax.annotation.Nonnull
  public Amount getUnitPrice() {
    return unitPrice;
  }


  public void setUnitPrice(Amount unitPrice) {
    this.unitPrice = unitPrice;
  }


  public OrderItemResponseAllOf unitVat(VatAmount unitVat) {
    
    this.unitVat = unitVat;
    return this;
  }

   /**
   * Get unitVat
   * @return unitVat
  **/
  @javax.annotation.Nonnull
  public VatAmount getUnitVat() {
    return unitVat;
  }


  public void setUnitVat(VatAmount unitVat) {
    this.unitVat = unitVat;
  }


  public OrderItemResponseAllOf quantity(BigDecimal quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * (positive float/decimal up to 3 decimal places) Item quantity.
   * minimum: 1
   * @return quantity
  **/
  @javax.annotation.Nonnull
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
    OrderItemResponseAllOf orderItemResponseAllOf = (OrderItemResponseAllOf) o;
    return Objects.equals(this.state, orderItemResponseAllOf.state) &&
        Objects.equals(this.sentDate, orderItemResponseAllOf.sentDate) &&
        Objects.equals(this.deliveryDate, orderItemResponseAllOf.deliveryDate) &&
        Objects.equals(this.deliveryTrackingNumber, orderItemResponseAllOf.deliveryTrackingNumber) &&
        Objects.equals(this.image, orderItemResponseAllOf.image) &&
        Objects.equals(this.unitPrice, orderItemResponseAllOf.unitPrice) &&
        Objects.equals(this.unitVat, orderItemResponseAllOf.unitVat) &&
        Objects.equals(this.quantity, orderItemResponseAllOf.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, sentDate, deliveryDate, deliveryTrackingNumber, image, unitPrice, unitVat, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemResponseAllOf {\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    sentDate: ").append(toIndentedString(sentDate)).append("\n");
    sb.append("    deliveryDate: ").append(toIndentedString(deliveryDate)).append("\n");
    sb.append("    deliveryTrackingNumber: ").append(toIndentedString(deliveryTrackingNumber)).append("\n");
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
    openapiFields.add("state");
    openapiFields.add("sentDate");
    openapiFields.add("deliveryDate");
    openapiFields.add("deliveryTrackingNumber");
    openapiFields.add("image");
    openapiFields.add("unitPrice");
    openapiFields.add("unitVat");
    openapiFields.add("quantity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("sentDate");
    openapiRequiredFields.add("deliveryDate");
    openapiRequiredFields.add("deliveryTrackingNumber");
    openapiRequiredFields.add("unitPrice");
    openapiRequiredFields.add("unitVat");
    openapiRequiredFields.add("quantity");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderItemResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OrderItemResponseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderItemResponseAllOf is not found in the empty JSON string", OrderItemResponseAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrderItemResponseAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderItemResponseAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderItemResponseAllOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("deliveryTrackingNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deliveryTrackingNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliveryTrackingNumber").toString()));
      }
      // validate the optional field `image`
      if (jsonObj.get("image") != null && !jsonObj.get("image").isJsonNull()) {
        FileResponse.validateJsonObject(jsonObj.getAsJsonObject("image"));
      }
      // validate the required field `unitPrice`
      Amount.validateJsonObject(jsonObj.getAsJsonObject("unitPrice"));
      // validate the required field `unitVat`
      VatAmount.validateJsonObject(jsonObj.getAsJsonObject("unitVat"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderItemResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderItemResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderItemResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderItemResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderItemResponseAllOf>() {
           @Override
           public void write(JsonWriter out, OrderItemResponseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderItemResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderItemResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderItemResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to OrderItemResponseAllOf
  */
  public static OrderItemResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderItemResponseAllOf.class);
  }

 /**
  * Convert an instance of OrderItemResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

