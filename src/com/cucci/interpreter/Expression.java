package com.cucci.interpreter;

/**
 * 表达式类
 *
 * @author shenyw
 **/
public abstract class Expression {

    /**
     * 解释器
     *
     * @param context 乐谱文本
     */
    public void interpret(PlayContext context) {
        if (context.getText().length() > 0) {
            String playKey = context.getText().substring(0, 1);
            context.setText(context.getText().substring(2));
            double playValue = Double.parseDouble(context.getText().substring(0, context.getText().indexOf(" ")));
            context.setText(context.getText().substring(context.getText().indexOf(" ") + 1));
            execute(playKey, playValue);
        }
    }

    /**
     * 执行音乐
     *
     * @param key
     * @param value
     */
    public abstract void execute(String key, double value);

}
