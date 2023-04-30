from fastapi import FastAPI
from model import Item
from cat import Cat
from enum import Enum

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


@app.get('/cat',response_model=Cat)

async def get_cat(cat: Cat):
    return cat


@app.get("/items/{item_id}/{q}")
async def read_item(item_id: int, q: str):
    return {
        "item_id": item_id, "q": q
    }
class ModelName(str, Enum):
    alexnet = "alexnet"
    resnet = "resnet"
    lenet = "lenet"


@app.get("/models/{model_name}")
async def get_model(model_name: ModelName):
    if model_name is ModelName.alexnet:
        return {"model_name": model_name, "message": "Deep Learning FTW!"}

    if model_name.value == "lenet":
        return {"model_name": model_name, "message": "LeCNN all the images"}

    return {"model_name": model_name, "message": "Have some residuals"}

