package io.legado.app.lib.theme.view

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import io.legado.app.R
import io.legado.app.lib.theme.Selector
import io.legado.app.lib.theme.ThemeStore
import io.legado.app.utils.dp

class ATEStrokeTextView : AppCompatTextView {
    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    init {
        background = Selector.shapeBuild()
            .setCornerRadius(1.dp)
            .setStrokeWidth(1.dp)
            .setDisabledStrokeColor(context.resources.getColor(R.color.md_grey_500))
            .setDefaultStrokeColor(ThemeStore.textColorSecondary(context))
            .setSelectedStrokeColor(ThemeStore.accentColor(context))
            .setPressedBgColor(context.resources.getColor(R.color.transparent30))
            .create()
        setTextColor(
            Selector.colorBuild()
                .setDefaultColor(ThemeStore.textColorSecondary(context))
                .setSelectedColor(ThemeStore.accentColor(context))
                .setDisabledColor(context.resources.getColor(R.color.md_grey_500))
                .create()
        )
    }
}
