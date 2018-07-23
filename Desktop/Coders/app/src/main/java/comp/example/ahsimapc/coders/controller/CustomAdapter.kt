package comp.example.ahsimapc.coders.controller

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import comp.example.ahsimapc.coders.R
import comp.example.ahsimapc.coders.model.Categories

class CustomAdapter( contxt:Context, categorie:List<Categories>): BaseAdapter() {

    val mcontext=contxt
    val mcategorie=categorie

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view:View
        var holder:ViewHolder
        if(convertView==null)
        {
           view=LayoutInflater.from(mcontext).inflate(R.layout.list_item,null)
            holder=ViewHolder()
            println("new Created")

            holder.imageview=view.findViewById(R.id.imageView)
            holder.textview=view.findViewById(R.id.textView)
            view.tag=holder
        }else
        {println("old used")
            holder=convertView.tag as ViewHolder
            view=convertView
        }


        val cat=mcategorie[position]
        holder.textview?.text=cat.title
        val imageId=mcontext.resources.getIdentifier(cat.image,"drawable",mcontext.packageName)
        holder.imageview?.setImageResource(imageId)
        return view


            }

    override fun getItem(position: Int): Any {
       return mcategorie[position]   }

    override fun getItemId(position: Int): Long {
return 0       }

    override fun getCount(): Int {

return mcategorie.size    }



    private class ViewHolder{
        var imageview:ImageView?=null
        var textview:TextView?=null


    }

}
