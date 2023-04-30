from fastapi import FastAPI
from model import Item
from databases import Database

app=FastAPI()
#connect to mysql
database = Database("mysql+aiomysql://root:password@127.0.0.1:3306/myDB")

@app.on_event('startup')
async def database_connect():
    await database.connect()

@app.post("/item")
async def insert_item(item:Item):
    query = "Insert into Items(id,name,price) values (:id, :name, :price)"
    values= {
        "id":item.id,
        "name":item.name,
        "price":item.price
    }
    await database.execute(query=query, values=values)

@app.delete('/items')

async def delete_item(id:int):
    query="Delete from items where id=:id"
    values={"id":id}
    database.execute(query, values)

@app.put('/items')

async def update_item(item:Item):
    query="Update items set id=:id, name=:name, price=:price"
    values={"id":item.id,
            "name":item.name,
            "price":item.price}
    database.execute(query=query, values=values)