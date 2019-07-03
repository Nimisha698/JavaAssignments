package accesscontrolandmore.task3;

public class MainTask3 {
    public static void main(String args[])
    {
        MainTask3 object=new MainTask3();
        FactoryProcess factoryProcess=new FactoryProcess();
        object.productionBranch1(factoryProcess);
        object.productionBranch2(factoryProcess);
        object.productionBranch3(factoryProcess);
        object.productionBranch4(factoryProcess);
    }
    public void productionBranch1(RawMaterials rawMaterials)
    {
        rawMaterials.milk();
        rawMaterials.cocoa();
    }
    public void productionBranch2(Manufacture manufacture)
    {
        manufacture.mix();
        manufacture.set();
    }
    public void productionBranch3(Supply supply)
    {
        supply.test();
        supply.supply();

    }
    public void productionBranch4(inheritedInterface inheritedInterface)
    {

    }
}
