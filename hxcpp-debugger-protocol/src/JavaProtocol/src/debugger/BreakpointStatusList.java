// Generated by Haxe 4.0.0-preview.5+7eb789f54
package debugger;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class BreakpointStatusList extends haxe.lang.ParamEnum
{
	public BreakpointStatusList(int index, java.lang.Object[] params)
	{
		//line 256 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		super(index, params);
	}
	
	
	public static final java.lang.String[] __hx_constructs = new java.lang.String[]{"Terminator", "Nonexistent", "Disabled", "AlreadyDisabled", "Enabled", "AlreadyEnabled", "Deleted"};
	
	public static final debugger.BreakpointStatusList Terminator = new debugger.BreakpointStatusList(0, null);
	
	public static debugger.BreakpointStatusList Nonexistent(int number, debugger.BreakpointStatusList next)
	{
		//line 220 "C:\\HaxeToolkit\\haxe\\lib\\hxcpp-debugger\\git\\debugger\\IController.hx"
		return new debugger.BreakpointStatusList(1, new java.lang.Object[]{number, next});
	}
	
	
	public static debugger.BreakpointStatusList Disabled(int number, debugger.BreakpointStatusList next)
	{
		//line 221 "C:\\HaxeToolkit\\haxe\\lib\\hxcpp-debugger\\git\\debugger\\IController.hx"
		return new debugger.BreakpointStatusList(2, new java.lang.Object[]{number, next});
	}
	
	
	public static debugger.BreakpointStatusList AlreadyDisabled(int number, debugger.BreakpointStatusList next)
	{
		//line 222 "C:\\HaxeToolkit\\haxe\\lib\\hxcpp-debugger\\git\\debugger\\IController.hx"
		return new debugger.BreakpointStatusList(3, new java.lang.Object[]{number, next});
	}
	
	
	public static debugger.BreakpointStatusList Enabled(int number, debugger.BreakpointStatusList next)
	{
		//line 223 "C:\\HaxeToolkit\\haxe\\lib\\hxcpp-debugger\\git\\debugger\\IController.hx"
		return new debugger.BreakpointStatusList(4, new java.lang.Object[]{number, next});
	}
	
	
	public static debugger.BreakpointStatusList AlreadyEnabled(int number, debugger.BreakpointStatusList next)
	{
		//line 224 "C:\\HaxeToolkit\\haxe\\lib\\hxcpp-debugger\\git\\debugger\\IController.hx"
		return new debugger.BreakpointStatusList(5, new java.lang.Object[]{number, next});
	}
	
	
	public static debugger.BreakpointStatusList Deleted(int number, debugger.BreakpointStatusList next)
	{
		//line 225 "C:\\HaxeToolkit\\haxe\\lib\\hxcpp-debugger\\git\\debugger\\IController.hx"
		return new debugger.BreakpointStatusList(6, new java.lang.Object[]{number, next});
	}
	
	
	@Override public java.lang.String getTag()
	{
		//line 217 "C:\\HaxeToolkit\\haxe\\lib\\hxcpp-debugger\\git\\debugger\\IController.hx"
		return debugger.BreakpointStatusList.__hx_constructs[this.index];
	}
	
	
}


