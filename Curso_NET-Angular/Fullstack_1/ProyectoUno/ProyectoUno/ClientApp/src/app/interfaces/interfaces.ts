export interface Message {
  Id: number,
  Name: string,
  Text: string
}

export interface Response {
  Success: number,
  Message: string,
  Data: any
}
