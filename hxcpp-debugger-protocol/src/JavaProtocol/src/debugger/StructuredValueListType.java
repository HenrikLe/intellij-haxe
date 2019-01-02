// Generated by Haxe 4.0.0-preview.5+7eb789f54
package debugger;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class StructuredValueListType extends haxe.lang.ParamEnum
{
	public StructuredValueListType(int index, java.lang.Object[] params)
	{
		//line 256 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		super(index, params);
	}
	
	
	public static final java.lang.String[] __hx_constructs = new java.lang.String[]{"Anonymous", "Instance", "_Array", "Class"};
	
	public static final debugger.StructuredValueListType Anonymous = new debugger.StructuredValueListType(0, null);
	
	public static debugger.StructuredValueListType Instance(java.lang.String className)
	{
		//line 300 "C:\\HaxeToolkit\\haxe\\lib\\hxcpp-debugger\\git\\debugger\\IController.hx"
		return new debugger.StructuredValueListType(1, new java.lang.Object[]{className});
	}
	
	
	public static final debugger.StructuredValueListType _Array = new debugger.StructuredValueListType(2, null);
	
	public static final debugger.StructuredValueListType Class = new debugger.StructuredValueListType(3, null);
	
	@Override public java.lang.String getTag()
	{
		//line 297 "C:\\HaxeToolkit\\haxe\\lib\\hxcpp-debugger\\git\\debugger\\IController.hx"
		return debugger.StructuredValueListType.__hx_constructs[this.index];
	}
	
	
}


