package WebServer.E_Commerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ECommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceApplication.class, args);
	}

	/*
	Core Classes
User
Attributes:
userId: String
username: String
password: String
email: String
firstName: String
lastName: String
address: String
phoneNumber: String
userType: String (e.g., Buyer, Seller)
profilePicture: String
ratings: List<Rating>
reviews: List<Review>
Methods:
register()
login()
updateProfile()
viewProfile()
deleteAccount()
Dress

Attributes:
dressId: String
ownerId: String
title: String
description: String
size: String
color: String
price: Double
status: String (e.g., Available, Rented, Sold)
images: List<String>
category: String
ratings: List<Rating>
reviews: List<Review>
createdAt: Date
updatedAt: Date
Methods:
createListing()
updateListing()
deleteListing()
viewListing()
searchDress()
Transaction

Attributes:
transactionId: String
buyerId: String
sellerId: String
dressId: String
transactionDate: Date
amount: Double
paymentMethod: String
transactionStatus: String (e.g., Pending, Completed, Cancelled)
Methods:
initiateTransaction()
updateTransaction()
cancelTransaction()
viewTransaction()
Rating

Attributes:
ratingId: String
userId: String
dressId: String
score: Int
comment: String
createdAt: Date
Methods:
createRating()
updateRating()
deleteRating()
viewRating()
Review

Attributes:
reviewId: String
userId: String
dressId: String
comment: String
createdAt: Date
Methods:
createReview()
updateReview()
deleteReview()
viewReview()
Notification

Attributes:
notificationId: String
userId: String
message: String
readStatus: Boolean
createdAt: Date
Methods:
sendNotification()
viewNotification()
markAsRead()
deleteNotification()
Utility Classes
AIRecommendation

Attributes:
userId: String
recommendedDresses: List<Dress>
Methods:
generateRecommendations()
Payment

Attributes:
paymentId: String
transactionId: String
amount: Double
paymentMethod: String
paymentStatus: String (e.g., Success, Failed, Pending)
Methods:
processPayment()
refundPayment()
viewPaymentDetails()
CustomerSupport

Attributes:
supportId: String
userId: String
query: String
response: String
status: String (e.g., Open, Closed)
createdAt: Date
updatedAt: Date
Methods:
submitQuery()
updateQuery()
closeQuery()
viewQuery()
Admin Classes
Admin
Attributes:
adminId: String
username: String
password: String
email: String
role: String (e.g., Super Admin, Moderator)
Methods:
login()
manageUsers()
manageListings()
viewReports()
manageTransactions()
	 */

}
