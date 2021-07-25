package ScalaBasic.AbstractFactoryDemo1.pizzaStore.pizza;

// https://www.bilibili.com/video/BV12N411R726?p=256&spm_id_from=pageDriver

class NYCheesePizza extends Pizza {
    override def prepare(): Unit = {
        this.name = "NYC cheese pizza"
        println(this.name + " preparing ...")
    }
}