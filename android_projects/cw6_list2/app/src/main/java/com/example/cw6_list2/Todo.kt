package com.example.cw6_list2

class Todo(content:String,priority:Priority) {
    private var content="";
    private var priority:Priority;
    init {
        this.content = content
        this.priority = priority
    }
    public var Content:String
        get() {
            return content
        }
        set(value) {
            content = value.toString().trim()
        }
    public var MyPririty:Priority
        get() {
            return priority
        }
        set(value){
            priority = value
        }
    public override fun toString(): String {
        return Content+" ważność: "+MyPririty;
    }
}
enum class Priority(var info:String){
    LOW("niski"),
    MIDDLE("średni"),
    HIGH("wysoki"),
    ALERT("najwyższy");

    override fun toString(): String {
        return info;
    }
}