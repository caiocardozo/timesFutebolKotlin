package com.caio.caiocardozo.timesfutebolkotlin


import android.content.Context
import android.support.v4.content.ContextCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.caio.caiocardozo.timesfutebolkotlin.Objetos.ItemTime

class ItemAdapter : ArrayAdapter<ItemTime>
{
    private var backgroundColor: Int = 0

    //inicializa o adapter
    constructor(context: Context, list: ArrayList<ItemTime>, backgroundColor: Int) : super(context, 0,list) {
        this.backgroundColor = backgroundColor
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var itemView = convertView
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        }


        //retorna o item que foi pego no codigo acima
        var item = getItem(position) as ItemTime

        //recupera a view do layout para setar
        var titulo: TextView = itemView!!.findViewById(R.id.item_titulo) //o !! verifica se a variavel e nula
        titulo.text = item.titulo

        var estadio: TextView = itemView!!.findViewById(R.id.item_estadio)
        estadio.text = item.estadio

        var image: ImageView = itemView!!.findViewById(R.id.item_icone)
        image.setImageResource(item.imagem)


        var layoutTexto: LinearLayout = itemView.findViewById(R.id.layout_textos)

        var cor = ContextCompat.getColor(context, backgroundColor)
        layoutTexto.setBackgroundColor(cor)

        return itemView
    }
}
