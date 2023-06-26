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
import cz.skippay.model.Address;
import cz.skippay.model.Amount;
import cz.skippay.model.DeliveryCarrier;
import cz.skippay.model.DeliveryType;
import cz.skippay.model.DocumentRequest;
import cz.skippay.model.OrderItemRequest;
import cz.skippay.model.VatAmount;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * OrderChangeRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-26T12:24:35.068083+02:00[Europe/Prague]")
public class OrderChangeRequest {
  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public static final String SERIALIZED_NAME_VARIABLE_SYMBOLS = "variableSymbols";
  @SerializedName(SERIALIZED_NAME_VARIABLE_SYMBOLS)
  private List<String> variableSymbols;

  public static final String SERIALIZED_NAME_TOTAL_PRICE = "totalPrice";
  @SerializedName(SERIALIZED_NAME_TOTAL_PRICE)
  private Amount totalPrice;

  public static final String SERIALIZED_NAME_TOTAL_VAT = "totalVat";
  @SerializedName(SERIALIZED_NAME_TOTAL_VAT)
  private List<VatAmount> totalVat;

  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<Address> addresses;

  public static final String SERIALIZED_NAME_DELIVERY_TYPE = "deliveryType";
  @SerializedName(SERIALIZED_NAME_DELIVERY_TYPE)
  private DeliveryType deliveryType;

  public static final String SERIALIZED_NAME_DELIVERY_CARRIER = "deliveryCarrier";
  @SerializedName(SERIALIZED_NAME_DELIVERY_CARRIER)
  private DeliveryCarrier deliveryCarrier;

  public static final String SERIALIZED_NAME_RESERVATION_DATE = "reservationDate";
  @SerializedName(SERIALIZED_NAME_RESERVATION_DATE)
  private String reservationDate;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<OrderItemRequest> items;

  public static final String SERIALIZED_NAME_DOCUMENTS = "documents";
  @SerializedName(SERIALIZED_NAME_DOCUMENTS)
  private List<DocumentRequest> documents;

  public OrderChangeRequest() {
  }

  public OrderChangeRequest number(String number) {
    
    this.number = number;
    return this;
  }

   /**
   * Order number (internal for e-shop)
   * @return number
  **/
  @javax.annotation.Nullable
  public String getNumber() {
    return number;
  }


  public void setNumber(String number) {
    this.number = number;
  }


  public OrderChangeRequest variableSymbols(List<String> variableSymbols) {
    
    this.variableSymbols = variableSymbols;
    return this;
  }

  public OrderChangeRequest addVariableSymbolsItem(String variableSymbolsItem) {
    if (this.variableSymbols == null) {
      this.variableSymbols = new ArrayList<>();
    }
    this.variableSymbols.add(variableSymbolsItem);
    return this;
  }

   /**
   * Variable symbols for pairing. First symbol in array is used for making the payment to your account (if not specified later in &#x60;Mark order items as sent&#x60; or &#x60;Mark order items as delivered&#x60;) or we expect you make payment on our account with this symbol (if not specified later in &#x60;Mark order items as returned&#x60; operation). Strings must contain only numbers, maximum length is 10 characters (digits).
   * @return variableSymbols
  **/
  @javax.annotation.Nullable
  public List<String> getVariableSymbols() {
    return variableSymbols;
  }


  public void setVariableSymbols(List<String> variableSymbols) {
    this.variableSymbols = variableSymbols;
  }


  public OrderChangeRequest totalPrice(Amount totalPrice) {
    
    this.totalPrice = totalPrice;
    return this;
  }

   /**
   * Get totalPrice
   * @return totalPrice
  **/
  @javax.annotation.Nullable
  public Amount getTotalPrice() {
    return totalPrice;
  }


  public void setTotalPrice(Amount totalPrice) {
    this.totalPrice = totalPrice;
  }


  public OrderChangeRequest totalVat(List<VatAmount> totalVat) {
    
    this.totalVat = totalVat;
    return this;
  }

  public OrderChangeRequest addTotalVatItem(VatAmount totalVatItem) {
    if (this.totalVat == null) {
      this.totalVat = new ArrayList<>();
    }
    this.totalVat.add(totalVatItem);
    return this;
  }

   /**
   * Total VAT amounts split by their VAT rates
   * @return totalVat
  **/
  @javax.annotation.Nullable
  public List<VatAmount> getTotalVat() {
    return totalVat;
  }


  public void setTotalVat(List<VatAmount> totalVat) {
    this.totalVat = totalVat;
  }


  public OrderChangeRequest addresses(List<Address> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public OrderChangeRequest addAddressesItem(Address addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Addresses. Only &#x60;BILLING&#x60; and &#x60;DELIVERY&#x60; types are allowed.
   * @return addresses
  **/
  @javax.annotation.Nullable
  public List<Address> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }


  public OrderChangeRequest deliveryType(DeliveryType deliveryType) {
    
    this.deliveryType = deliveryType;
    return this;
  }

   /**
   * Get deliveryType
   * @return deliveryType
  **/
  @javax.annotation.Nullable
  public DeliveryType getDeliveryType() {
    return deliveryType;
  }


  public void setDeliveryType(DeliveryType deliveryType) {
    this.deliveryType = deliveryType;
  }


  public OrderChangeRequest deliveryCarrier(DeliveryCarrier deliveryCarrier) {
    
    this.deliveryCarrier = deliveryCarrier;
    return this;
  }

   /**
   * Get deliveryCarrier
   * @return deliveryCarrier
  **/
  @javax.annotation.Nullable
  public DeliveryCarrier getDeliveryCarrier() {
    return deliveryCarrier;
  }


  public void setDeliveryCarrier(DeliveryCarrier deliveryCarrier) {
    this.deliveryCarrier = deliveryCarrier;
  }


  public OrderChangeRequest reservationDate(String reservationDate) {
    
    this.reservationDate = reservationDate;
    return this;
  }

   /**
   * Date and time until order is reserved.  Until &#39;reservationDate&#39; Skip Pay will try to notify partner with Application notification about approval or rejection.  After this date and time, e-shop does not guarantee items availability (if application processing is longer, it may endanger order fullfillment).
   * @return reservationDate
  **/
  @javax.annotation.Nullable
  public String getReservationDate() {
    return reservationDate;
  }


  public void setReservationDate(String reservationDate) {
    this.reservationDate = reservationDate;
  }


  public OrderChangeRequest items(List<OrderItemRequest> items) {
    
    this.items = items;
    return this;
  }

  public OrderChangeRequest addItemsItem(OrderItemRequest itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Order items
   * @return items
  **/
  @javax.annotation.Nullable
  public List<OrderItemRequest> getItems() {
    return items;
  }


  public void setItems(List<OrderItemRequest> items) {
    this.items = items;
  }


  public OrderChangeRequest documents(List<DocumentRequest> documents) {
    
    this.documents = documents;
    return this;
  }

  public OrderChangeRequest addDocumentsItem(DocumentRequest documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * Attached documents (invoices etc.)
   * @return documents
  **/
  @javax.annotation.Nullable
  public List<DocumentRequest> getDocuments() {
    return documents;
  }


  public void setDocuments(List<DocumentRequest> documents) {
    this.documents = documents;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderChangeRequest orderChangeRequest = (OrderChangeRequest) o;
    return Objects.equals(this.number, orderChangeRequest.number) &&
        Objects.equals(this.variableSymbols, orderChangeRequest.variableSymbols) &&
        Objects.equals(this.totalPrice, orderChangeRequest.totalPrice) &&
        Objects.equals(this.totalVat, orderChangeRequest.totalVat) &&
        Objects.equals(this.addresses, orderChangeRequest.addresses) &&
        Objects.equals(this.deliveryType, orderChangeRequest.deliveryType) &&
        Objects.equals(this.deliveryCarrier, orderChangeRequest.deliveryCarrier) &&
        Objects.equals(this.reservationDate, orderChangeRequest.reservationDate) &&
        Objects.equals(this.items, orderChangeRequest.items) &&
        Objects.equals(this.documents, orderChangeRequest.documents);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, variableSymbols, totalPrice, totalVat, addresses, deliveryType, deliveryCarrier, reservationDate, items, documents);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderChangeRequest {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    variableSymbols: ").append(toIndentedString(variableSymbols)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    totalVat: ").append(toIndentedString(totalVat)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    deliveryType: ").append(toIndentedString(deliveryType)).append("\n");
    sb.append("    deliveryCarrier: ").append(toIndentedString(deliveryCarrier)).append("\n");
    sb.append("    reservationDate: ").append(toIndentedString(reservationDate)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
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
    openapiFields.add("number");
    openapiFields.add("variableSymbols");
    openapiFields.add("totalPrice");
    openapiFields.add("totalVat");
    openapiFields.add("addresses");
    openapiFields.add("deliveryType");
    openapiFields.add("deliveryCarrier");
    openapiFields.add("reservationDate");
    openapiFields.add("items");
    openapiFields.add("documents");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderChangeRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OrderChangeRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderChangeRequest is not found in the empty JSON string", OrderChangeRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrderChangeRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderChangeRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("number") != null && !jsonObj.get("number").isJsonNull()) && !jsonObj.get("number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("number").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("variableSymbols") != null && !jsonObj.get("variableSymbols").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `variableSymbols` to be an array in the JSON string but got `%s`", jsonObj.get("variableSymbols").toString()));
      }
      // validate the optional field `totalPrice`
      if (jsonObj.get("totalPrice") != null && !jsonObj.get("totalPrice").isJsonNull()) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("totalPrice"));
      }
      if (jsonObj.get("totalVat") != null && !jsonObj.get("totalVat").isJsonNull()) {
        JsonArray jsonArraytotalVat = jsonObj.getAsJsonArray("totalVat");
        if (jsonArraytotalVat != null) {
          // ensure the json data is an array
          if (!jsonObj.get("totalVat").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `totalVat` to be an array in the JSON string but got `%s`", jsonObj.get("totalVat").toString()));
          }

          // validate the optional field `totalVat` (array)
          for (int i = 0; i < jsonArraytotalVat.size(); i++) {
            VatAmount.validateJsonObject(jsonArraytotalVat.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("addresses") != null && !jsonObj.get("addresses").isJsonNull()) {
        JsonArray jsonArrayaddresses = jsonObj.getAsJsonArray("addresses");
        if (jsonArrayaddresses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("addresses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `addresses` to be an array in the JSON string but got `%s`", jsonObj.get("addresses").toString()));
          }

          // validate the optional field `addresses` (array)
          for (int i = 0; i < jsonArrayaddresses.size(); i++) {
            Address.validateJsonObject(jsonArrayaddresses.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `deliveryCarrier`
      if (jsonObj.get("deliveryCarrier") != null && !jsonObj.get("deliveryCarrier").isJsonNull()) {
        DeliveryCarrier.validateJsonObject(jsonObj.getAsJsonObject("deliveryCarrier"));
      }
      if ((jsonObj.get("reservationDate") != null && !jsonObj.get("reservationDate").isJsonNull()) && !jsonObj.get("reservationDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reservationDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reservationDate").toString()));
      }
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull()) {
        JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
        if (jsonArrayitems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
          }

          // validate the optional field `items` (array)
          for (int i = 0; i < jsonArrayitems.size(); i++) {
            OrderItemRequest.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("documents") != null && !jsonObj.get("documents").isJsonNull()) {
        JsonArray jsonArraydocuments = jsonObj.getAsJsonArray("documents");
        if (jsonArraydocuments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("documents").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `documents` to be an array in the JSON string but got `%s`", jsonObj.get("documents").toString()));
          }

          // validate the optional field `documents` (array)
          for (int i = 0; i < jsonArraydocuments.size(); i++) {
            DocumentRequest.validateJsonObject(jsonArraydocuments.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderChangeRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderChangeRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderChangeRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderChangeRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderChangeRequest>() {
           @Override
           public void write(JsonWriter out, OrderChangeRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderChangeRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderChangeRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderChangeRequest
  * @throws IOException if the JSON string is invalid with respect to OrderChangeRequest
  */
  public static OrderChangeRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderChangeRequest.class);
  }

 /**
  * Convert an instance of OrderChangeRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

