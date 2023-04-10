from fastapi import FastAPI
from model import Item

app=FastAPI()

@app.get('/')

async def read_root():
    return {"message":"hello world"}

@app.get('/{id}',response_model=int)
async def read_int(id: int):
    return id


@app.get('/bool/{truth}',response_model=bool)
async def read_bool(truth:bool):
    return not truth



@app.post('/item',response_model=Item)

async def create_item(item: Item):
    return item


@app.put('/item',response_model=Item)

async def update_item(item: Item):
    return item


@app.delete('/item',response_model=Item)

async def delete_item(item: Item):
    return item