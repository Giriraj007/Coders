package comp.example.ahsimapc.coders.Services

import comp.example.ahsimapc.coders.model.Categories
import comp.example.ahsimapc.coders.model.Product

object DataService {
   val categories=listOf(Categories("Hats","hatimage"),
                         Categories("hoodies","hoodieimage"),
                         Categories("Shirts","shirtimage"),
                         Categories("Digital Goods","digitalgoodsimage"))



    val hat= listOf<Product>(Product("Black Long Hat","$18","hat1"),
                             Product("Black DevSlop Hat","$20","hat2"),
                             Product("White cap","$25","hat3"),
                             Product("Black Swag cap","$19","hat4"))

    val hoodies= listOf<Product>(Product("Black Hoodeie","$50","hoodie1"),
                                 Product("Red Hoodie","$40","hoodie2"),
                                 Product("Dev Slope Hoodie(Chain)","$78","hoodie3"),
                                 Product("Dev Slope Hoodie(Without Chain)","$80","hoodie4"))


    val shirts= listOf<Product>(Product("Black T-Shirt","$30","shirt1"),
                                Product("Grey T-Shirt","$40","shirt2"),
                                Product("Red T-shirt","$45","shirt3"),
                                Product("Black Hustle","$49","shirt4"),
                                Product("Black K-F","$50","shirt5"))




}