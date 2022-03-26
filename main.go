package main




import (
  
  "fmt"
  "net/http"
)

func main(){
   fmt.Println("here comes the Sample golnang http project")

     http.HandleFunc("/hey",hello)
                                             


  http.ListenAndServe(":8080", nil) 

}



func hello(rw http.ResponseWriter, r* http.Request){


    fmt.Println(rw, "heybuddy")
}

