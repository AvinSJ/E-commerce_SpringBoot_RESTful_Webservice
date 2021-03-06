package com.sayone.ebazzar.exception;

public enum ErrorMessages {

    MISSING_REQUIRED_FIELD("Missing Required field. Please check documentation for required fields"),
    INTERNAL_SERVER_ERROR("internal error.Please debug."),
    NO_RECORD_FOUND("no record found.Please debug."),
    CART_ALREADY_CHECKED_OUT("Cart Already Checked Out"),
    EMPTY_CART("There are no products in the cart"),
    INVALID_ADDRESS("There is no address with this ID"),
    INVALID_USER_ADDRESS("This is not user address"),
    INVALID_ORDERID("There is no order with this ID"),
    SAME_STATUS("The order is already with the same status"),
    ALREADY_CANCELLED("The order is already cancelled"),
    INVALID_STATUS("This is not a valid status. Status can only be shipped, in-transit, delivered or cancelled"),
    NO_ORDER_STATUS("There is no order with this status"),
    ORDER_NOT_DELIVERED("The product is not yet delivered. So, you cannot give review"),
    PRODUCT_NOT_PURCHASED("You cannot give Review for a Product you have not purchased"),
    NO_PRODUCT_FOUND("There is no Product with the given ID"),
    NO_REVIEW_ID_FOUND("There is no Review for this product"),
    NO_USER_FOUND("There is no user with this ID"),
    INVALID_USER_ORDER("You dont have an order with this ID"),
    CANCEL_REJECTED("You cannot cancel the order as it is in-transit / delivered."),
    OUT_OF_STOCK("required quantity not available. Please update Cart Quantity/ Please wait for the seller to add products"),
    NO_ORDER_FOUND("There are no orders for this user"),
    COULD_NOT_UPDATE_RECORD("could not update record.Please debug."),
    COULD_NOT_DELETE_RECORD("could not delete record.Please debug."),
    RECORD_ALREADY_EXISTS("Record already exists"),
    CART_QUANTITY_PID_ERROR("either quantity <=0 or pid not given"),
    CART_PRODUCTID_NOTFOUND("PROVIDE PRODUCT ID"),
    REVIEW_ALREADY_GIVEN("User has Already given review for this product"),
    INVALID_RATING("Rating should be less than 6"),
    NO_REVIEW_GIVEN("There are no reviews given by you"),
    NO_REVIEW_FOUND("There is no review given for the specified product"),
    DELETED_ACCOUNT("Account is deleted"),
    WISH_PRODUCT_EXISTS("PRODUCT ALREADY IN WISH"),
    WISH_PID_NOTFOUND("PROVIDE PRODUCT ID");

    ErrorMessages(String errorMessages) {
        this.errorMessages = errorMessages;
    }

    private String errorMessages;

    public String getErrorMessages() {
        return errorMessages;
    }

}