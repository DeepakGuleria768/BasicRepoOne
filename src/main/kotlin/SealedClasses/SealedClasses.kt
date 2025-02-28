package SealedClasses

// Defining a sealed class to handle API responses
sealed class ApiResponse<out T> {
    data class Success<T>(val data: T) : ApiResponse<T>()
    data class Error(val message: String) : ApiResponse<Nothing>()
    object Loading : ApiResponse<Nothing>()
}

// Function to simulate an API call and return different responses
fun fetchUserData(userID: Int): ApiResponse<String> {
    return when (userID) {
        1 -> ApiResponse.Success("User data :Deepak")
        2 -> ApiResponse.Success("User data :john doe")
        else -> ApiResponse.Error("user not found")
    }
}

// Function to handle API responses
fun handleResponse(response: ApiResponse<String>) {
    when (response) {
        is ApiResponse.Success -> println("✅ Data received: ${response.data}")
        is ApiResponse.Error -> println("❌ Error: ${response.message}")
        ApiResponse.Loading -> println("⏳ Loading...")
    }
}


// Example 2nd

sealed class Operation {
    data class Add(val a: Int, val b: Int) : Operation()
    data class Sub(val a: Int, val b: Int) : Operation()
    data class Div(val a: Int, val b: Int) : Operation()
    data class Mod(val a: Int, val b: Int) : Operation()
    data class Mull(val a: Int, val b: Int) : Operation()
    object InvalidOperation : Operation()
}

// Function to perfomr the operation
fun calculate(operation: Operation): String {
    return when (operation) {
        is Operation.Add -> "this is addition"
        is Operation.Sub -> "this is Subtraction"
        is Operation.Div -> "this is Division"
        is Operation.Mod -> "this is Modulus"
        is Operation.Mull -> "this is Multiplication"
        Operation.InvalidOperation -> "❌ Invalid operation"
    }
}


// Main function to test the sealed class
fun main() {
    println("Fetching user with ID 1:")
    handleResponse(fetchUserData(1))

    println("\nFetching user with ID 2:")
    handleResponse(fetchUserData(2))

    println("\nFetching user with ID 3 (Invalid ID):")
    handleResponse(fetchUserData(3))

    println("\nSimulating a loading state:")
    handleResponse(ApiResponse.Loading)

    // Example 2nd
    val op1 = Operation.Add(10, 5)
    val op2 = Operation.Sub(20, 8)
    val op3 = Operation.Mull(4, 3)
    val op4 = Operation.Div(9, 3)
    val op5 = Operation.Mod(5, 0)
    val op6 = Operation.InvalidOperation

    println(calculate(op1))
    println(calculate(op2))
    println(calculate(op3))
    println(calculate(op4))
    println(calculate(op5))
    println(calculate(op6))
}